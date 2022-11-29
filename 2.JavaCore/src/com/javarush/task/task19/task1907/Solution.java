package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) {
        int countWorld = 0;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileReader file = new FileReader(br.readLine())){
            StringBuilder sb = new StringBuilder();
            while (file.ready()){
                sb.append( (char) file.read());
            }
            String [] strings = sb.toString().split("\\W");
            for (int i = 0; i < strings.length; i++) {
                if("world".equals(strings[i])){
                    countWorld++;
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(countWorld);

    }
}
