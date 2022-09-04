package com.javarush.task.pro.task15.task1507;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();

        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
                    int stringNumber = 1;
            for (String line : lines) {
                if (stringNumber%2 == 1){
                    System.out.println(line);
                }
                stringNumber++;
            }
        }
        catch (IOException e) {
            System.out.println("Oops" + e);
        }
    }
}

