package com.javarush.task.pro.task05.task0507;

import java.util.Scanner;

/* 
Максимальное из N чисел
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
        int max = array[0];
        for (int j = 1; j < N; j++) {
            if (array[j] > max) {
                max = array[j];
            }
        }
        System.out.println(max);
        //напишите тут ваш код
    }
}
