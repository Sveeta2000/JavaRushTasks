package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        try {
            FileInputStream fileInputStream = new FileInputStream(reader.readLine());
            reader.close();
            while (fileInputStream.available() > 0){

                if (fileInputStream.read() == 44){
                    count++;
                }
            }
            fileInputStream.close();
            System.out.println(count);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
