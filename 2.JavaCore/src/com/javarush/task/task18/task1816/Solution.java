package com.javarush.task.task18.task1816;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) {
        String fileName = args[0];
        long counter = 0;
        Set<Integer> englishLetters = new HashSet<>();
        for (int i = 65; i < 91; i++) {
            englishLetters.add(i);
        }
        for (int i = 97; i < 123; i++) {
            englishLetters.add(i);
        }

        try (FileReader file = new FileReader(fileName)){
            while (file.ready()){
                int i = file.read();
                if (englishLetters.contains(i)){
                    counter++;
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(counter);
    }
}
