package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {


        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String path =reader.readLine();
            FileInputStream file = new FileInputStream(path);
            Scanner scanner = new Scanner(file);
            StringBuilder sb = new StringBuilder();

            while (scanner.hasNextLine()){
                sb.append(scanner.nextLine()).append("\n");
            }
            System.out.print(sb.toString());
            reader.close();
            scanner.close();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}