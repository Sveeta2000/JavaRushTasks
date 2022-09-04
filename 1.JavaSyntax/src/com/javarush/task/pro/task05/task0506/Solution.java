package com.javarush.task.pro.task05.task0506;

import java.sql.SQLOutput;
import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = console.nextInt();
        }
        int min = array[0];
        for (int j = 1; j < N; j++) {
            if (array[j] < min) {
                min = array[j];
            }
        }
        System.out.println(min);


        //напишите тут ваш код
    }
}
