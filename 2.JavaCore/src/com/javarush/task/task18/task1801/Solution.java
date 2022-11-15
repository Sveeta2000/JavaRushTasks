package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            FileInputStream fileInputStream = new FileInputStream(reader.readLine());
            reader.close();
            int max = 0;
            while (fileInputStream.available() > 0){
                int x = fileInputStream.read();
                if ( x > max){
                    max = x;
                }
            }
            fileInputStream.close();
            System.out.println(max);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
