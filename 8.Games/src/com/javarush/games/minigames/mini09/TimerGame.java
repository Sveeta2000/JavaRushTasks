package com.javarush.games.minigames.mini09;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/* 
Таймер
*/

public class TimerGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(3, 3);
        setTurnTimer(1000);
    }

    @Override
    public void onTurn(int step) {
        if (step%2 == 0){
            for(int i =0; i<3; i++){
                for(int y = 0; y<3; y++){
                    setCellColor(i, y, Color.GREEN);
                }
            }
        }
        else {
            for(int i =0; i<3; i++){
                for(int y = 0; y<3; y++){
                    setCellColor(i, y, Color.ORANGE);
                }
            }
        }
        setCellNumber(1, 1, step);
    }
}