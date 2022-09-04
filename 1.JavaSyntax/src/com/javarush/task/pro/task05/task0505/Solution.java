package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        if (N > 0) {
            int[] array = new int[N];
            for ( int i = 0; i < N; i++) {
                array[i] = console.nextInt();
            }
            if (N % 2 != 0) {
                for (int j = 0; j < N; j++) {
                    System.out.println(array[j]);
                }
            } else {
                for (int k = N - 1; k >= 0; k--) {
                    System.out.println(array[k]);
                }
            }
        }
        //напишите тут ваш код
    }
}
