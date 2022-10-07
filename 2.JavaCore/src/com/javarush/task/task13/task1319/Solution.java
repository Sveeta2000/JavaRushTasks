package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            String str;
            do {
                str = reader.readLine();
                writer.write(str + "\n");
            } while (! str.equalsIgnoreCase("exit"));
            writer.close();
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
