package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileReader reader = new FileReader(br.readLine());
        FileWriter writer = new FileWriter(br.readLine())){
            int count = 1;
            while (reader.ready()){
                int symbol = reader.read();
                if (count%2 == 0){
                    writer.write(symbol);
                }
                count++;
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
