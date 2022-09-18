package com.javarush.games.game2048;

import com.javarush.engine.cell.*;

import java.util.Arrays;


/**
 * @author sveet
 * @date 15.09.2022
 */
public class Game2048 extends Game {

    private static final int SIDE = 4;

    private int [] [] gameField = new int[SIDE][SIDE];

    private boolean isGameStopped = false;

    private int score = 0;

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
        drawScene();
    }

    private void createGame(){
        gameField = new int[SIDE][SIDE];
        createNewNumber();
        createNewNumber();
    }

    private void drawScene(){
        for (int x = 0; x< SIDE; x++){
            for(int y=0; y<SIDE; y++){
                setCellColoredNumber(x,y, gameField[y][x]);
            }
        }
    }

    private void createNewNumber() {
        if (getMaxTileValue() == 2048){
            win();
        }
        int x;
        int y;
        do {
            x = getRandomNumber(SIDE);
            y = getRandomNumber(SIDE);
        } while (gameField[y][x] != 0);
        if (getRandomNumber(10) == 9) {
            gameField[y][x] = 4;
        } else {
            gameField[y][x] = 2;
        }
    }

    private Color getColorByValue(int value){
        switch (value){
            case 0 : return Color.LAVENDER;
            case 2 : return Color.MEDIUMTURQUOISE;
            case 4 : return Color.LIGHTGREEN;
            case 8 : return Color.HOTPINK;
            case 16 : return Color.TOMATO; //?
            case 32 : return Color.CORNFLOWERBLUE;
            case 64 : return Color.ORCHID;
            case 128 : return Color.KHAKI;
            case 256 : return Color.LIGHTPINK;
            case 512 : return Color.PALEVIOLETRED;
            case 1024 : return Color.MOCCASIN;
            case 2048 : return Color.MEDIUMORCHID;
            default:return Color.WHITE;
        }
    }

    private void setCellColoredNumber(int x, int y, int value){
        if (value == 0){
            setCellValueEx(x, y, getColorByValue(value), "");
        } else {
            setCellValueEx(x, y, getColorByValue(value), String.valueOf(value));
        }

    }

    /**
     * this method compresses the row to left
     * @param row one row of a chart
     * @return true if the row changed
     */
    private boolean compressRow(int[] row){
        int [] copy = Arrays.copyOf(row, SIDE);
        for (int i = 0; i<SIDE-1; i++){
            for (int x = 0; x<SIDE; x++){
                for (int y = x+1; y<SIDE; y++){
                    if (row[x]==0 && row[y] != 0){
                        row[x] = row[y];
                        row[y] = 0;
                    }
                }
            }
        }
        return !Arrays.equals(copy, row);
    }


    private boolean mergeRow(int[] row) {
        int [] copy = Arrays.copyOf(row, SIDE);
        for (int i = 0; i < SIDE-1; i++){
            if(row[i] == row[i+1]) {
                row[i] += row[i];
                row[i+1] = 0;
                score = score + (row[i]);
                setScore(score);
            }
        }

        return !Arrays.equals(copy, row);
    }

    private void rotateClockwise(){
        int [] [] rotated = new int[SIDE][SIDE];
        for (int i = 0; i <  SIDE; i++){
            for (int j = 0; j<SIDE; j++){
                rotated[j][i] = gameField[SIDE-i-1][j];
            }
        }
        gameField = Arrays.copyOf(rotated, SIDE);
    }

    private void moveLeft(){
        boolean checkChange = false;
        for (int i = 0; i<SIDE; i++) {
            int[] copy = Arrays.copyOf(gameField[i], SIDE);
            compressRow(gameField[i]);
            mergeRow(gameField[i]);
            compressRow(gameField[i]);
            if(!checkChange){
                if (!Arrays.equals(copy, gameField[i])){
                    checkChange = true;
                }
            }
        }
        if (checkChange){
            createNewNumber();

        }
    }
    
    private void moveRight(){
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
    }
    
    private void moveUp(){
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
    }
    
    private void moveDown(){
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
    }

    @Override
    public void onKeyPress(Key key) {
        if (!canUserMove()){
            gameOver();
        }
        if (isGameStopped){
            if (key == Key.SPACE) {
                isGameStopped = false;
                showMessageDialog(Color.TRANSPARENT, "", Color.TRANSPARENT, 0);
                createGame();
                drawScene();
                score = 0;
                setScore(score);
            }
        }
         else {
            switch (key){
                case LEFT: moveLeft();
                    drawScene();
                    break;
                case RIGHT: moveRight();
                    drawScene();
                    break;
                case UP: moveUp();
                    drawScene();
                    break;
                case DOWN: moveDown();
                    drawScene();
                    break;
            }
        }
    }

    private int getMaxTileValue(){
        int result = 0;
        for (int i=0; i<SIDE; i++){
             for (int j = 0; j<SIDE; j++){
                 result = Math.max(result, gameField[j][i]);
             }
        }
        return result;
    }

    private void win(){
        isGameStopped = true;
        showMessageDialog(Color.LIGHTYELLOW, "Вы победили! Ура!", Color.MEDIUMORCHID, 50);
    }

    private void gameOver(){
        isGameStopped = true;
        showMessageDialog(Color.LIGHTSALMON, "Упс! Вы проиграли!\nПопробуйте снова :)", Color.DARKRED, 30);
    }

    private boolean canUserMove(){

        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j<SIDE; j++){
                if (gameField[j][i] == 0) {
                    return true;
                }
            }
        }

        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE - 1; j++) {
                if (gameField[i][j] == gameField[i][j + 1]) {
                    return true;
                }
            }
        }
        rotateClockwise();
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE - 1; j++) {
                if (gameField[i][j] == gameField[i][j + 1]) {
                    rotateClockwise();
                    rotateClockwise();
                    rotateClockwise();
                    return true;
                }
            }
        }
        return false;
    }
}
