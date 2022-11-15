package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            FileInputStream fileInputStream = new FileInputStream(reader.readLine());
            reader.close();
            int min = Integer.MAX_VALUE;
            while (fileInputStream.available() > 0){
                min = Integer.min(min, fileInputStream.read());
            }
            fileInputStream.close();
            System.out.println(min);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
