package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        strings = new String[6];
        for (int j = 0; j < strings.length; j++) {
            strings[j] = console.nextLine();
        }
        for (int k = 0; k < strings.length; k++) {
            if (strings[k] != null){
                String str1 = strings[k];
                for (int l = 0; l < strings.length; l++) {
                    String str2 = strings[l];
                    if (str1.equals(str2) && k != l) {
                        strings[l] = null;
                        strings[k] = null;
                    }
                }
            }

        }
        //напишите тут ваш код
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
