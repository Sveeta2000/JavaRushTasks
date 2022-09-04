package com.javarush.task.pro.task15.task1506;



import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String filePath = scanner.nextLine();

        try {
            List<String> characters = Files.readAllLines(Paths.get(filePath));


            for (String item : characters) {
                int l = item.length();
                for (int i = 0; i<l; i++) {
                    char ch = item.charAt(i);
                    switch (ch) {
                        case ' ' :
                        case ',' :
                        case '.' :
                            break;
                        default:
                            System.out.print(ch);
                    }
                }
                System.out.println();
            }
        }
        catch (Exception e) {
            System.out.println("Oops" + e);
        }
    }
}

