package com.javarush.task.pro.task05.task0509;

/* 
Таблица умножения
*/

public class Solution {

    public static int[][] MULTIPLICATION_TABLE = new int[10][10];

    public static void main(String[] args) {
        for (int i = 1; i<=10; i++){
            for (int k = 1; k<=10; k++){
                MULTIPLICATION_TABLE[i-1][k-1] = i * k;
                System.out.print(MULTIPLICATION_TABLE[i-1][k-1] + " ");
            }
            System.out.println();
        }

        //напишите тут ваш код
    }
}
