package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
            String filePath = reader.readLine();
            FileInputStream file = new FileInputStream(filePath);
            ArrayList<Integer> list = new ArrayList<>();
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextInt()){
                list.add(scanner.nextInt());
            }

            list.removeIf(i -> i % 2 != 0);
            Collections.sort(list);
            for (Integer i: list) {
                System.out.println(i);
            }

            reader.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
