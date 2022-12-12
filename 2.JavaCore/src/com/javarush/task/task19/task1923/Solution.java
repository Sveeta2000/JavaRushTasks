package com.javarush.task.task19.task1923;

import java.io.*;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader file1 = new BufferedReader(new FileReader(args[0]));
            BufferedWriter file2 = new BufferedWriter(new FileWriter(args[1]))){
            while (file1.ready()){
                String line = file1.readLine();
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word.matches(".*[0-9].*")) {
                        file2.write(word + " ");
                    }
                }
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
