package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader reader = new BufferedReader(new FileReader(br.readLine()));
            BufferedWriter writer = new BufferedWriter(new FileWriter(br.readLine()))) {

            while (reader.ready()) {
                String line = reader.readLine();
                String newLine = line.replaceAll("\\p{P}", "");
                writer.write(newLine);
            }
        }catch (IOException ignore){
        }
    }
}
