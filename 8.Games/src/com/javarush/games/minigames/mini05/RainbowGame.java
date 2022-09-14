package com.javarush.games.minigames.mini05;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

/* 
Цвета радуги
*/

public class RainbowGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(10, 7);
        for (int colors = 0; colors<7; colors++){
            Color color = null;
            switch (colors) {
                case 0 : color = Color.RED;
                break;
                case 1 : color = Color.ORANGE;
                break;
                case 2 : color = Color.YELLOW;
                    break;
                case 3 : color = Color.GREEN;
                    break;
                case 4 : color = Color.BLUE;
                    break;
                case 5 : color = Color.INDIGO;
                    break;
                case 6 : color = Color.VIOLET;
                    break;
            }
            for (int i = 0; i<10; i++) {
                setCellColor(i, colors, color);
            }
        }
    }
}
