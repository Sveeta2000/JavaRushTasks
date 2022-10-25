package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String str = reader.readLine();
            switch (str) {
                case Planet.EARTH -> thePlanet = Earth.getInstance();
                case Planet.MOON -> thePlanet = Moon.getInstance();
                case Planet.SUN -> thePlanet = Sun.getInstance();
                default -> thePlanet = null;
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
