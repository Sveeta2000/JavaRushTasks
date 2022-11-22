package com.javarush.task.task18.task1817;

import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) {
        double allSymbols = 0;
        double spaces = 0;

        try(FileReader file = new FileReader(args[0])){
            while (file.ready()){
                int i = file.read();
                allSymbols++;
                if (i==32){
                    spaces++;
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        if (allSymbols!=0){
            double result = spaces/allSymbols*100;
            System.out.printf("%.2f", result);
        }

    }
}
