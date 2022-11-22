package com.javarush.task.task18.task1821;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* 
Встречаемость символов
*/

public class Solution {
    private static Map<Integer, Integer> charMap = new HashMap<>();

    public static void main(String[] args) {
        for (int i = 0; i < 128; i++) {
            charMap.put(i, 0);
        }
        try (FileReader reader = new FileReader(args[0])){
            while (reader.ready()){
                int i = reader.read();
                if (charMap.containsKey(i)){
                    charMap.replace(i, charMap.get(i)+1);
                } else{
                    charMap.put(i, 1);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        for (int i = 0; i < 128; i++) {
            int value = charMap.get(i);
            if(value!=0){
                System.out.println(((char) i) + " " + value);
            }
        }

    }
}
