package com.javarush.task.task18.task1824;

import java.io.*;

/* 
Файлы и исключения
*/

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            while (true){
                String name = reader.readLine();
                try(FileInputStream file = new FileInputStream(name)){
                }catch (FileNotFoundException fnf){
                    System.out.println(name);
                    break;
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
