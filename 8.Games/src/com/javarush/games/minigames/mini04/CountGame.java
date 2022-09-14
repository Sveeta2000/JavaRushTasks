package com.javarush.games.minigames.mini04;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/* 
Считаем клетки
*/

public class CountGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(10, 10);
        showGrid(false);
        for (int j = 0; j < 50; j++) {
            int x = getRandomNumber(10);
            int y = getRandomNumber(10);
            setCellColor(x, y, Color.GREEN);
            setCellNumber(x, y, getRandomNumber(100));
        }
        showResult();
    }

    public void showResult() {
        int countCells = 0;
        int countNumbers = 0;
        for (int width = 0; width<10; width++){
            for (int height = 0; height<10; height++) {
                if (Color.GREEN == getCellColor(width, height)) {
                    countCells += 1;
                    countNumbers += getCellNumber(width, height);
                }
            }
        }
        printSum(countNumbers);
        printCountOfGreenCells(countCells);
    }

    private void printSum(int sum) {
        System.out.println("Сумма всех чисел = " + sum);
    }

    private void printCountOfGreenCells(int count) {
        System.out.println("Количество зеленых клеток = " + count);
    }
}
