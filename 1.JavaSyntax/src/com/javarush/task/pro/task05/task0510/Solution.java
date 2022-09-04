package com.javarush.task.pro.task05.task0510;

/* 
Треугольный массив
*/

public class Solution {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        for (int i = 0; i<10; i++) {
            result[i] = new int[i+1];
            for (int k = 0; k < result[i].length; k++) {
                result[i][k] = i + k;
                System.out.print(result[i][k] + " ");
            }
            System.out.println();
        }

        //напишите тут ваш код
    }
}
