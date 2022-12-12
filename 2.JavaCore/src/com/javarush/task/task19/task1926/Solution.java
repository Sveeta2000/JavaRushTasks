package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(console.readLine()))){
            while ((reader.ready())){
                String line = reader.readLine();
                StringBuffer reversedLine = new StringBuffer(line).reverse();
                System.out.println(reversedLine);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
