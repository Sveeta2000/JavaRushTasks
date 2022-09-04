package com.javarush.task.pro.task05.task0512;

/* 
Создаем мультимассив
*/

public class Solution {

    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        for (int i = 0; i < multiArray.length; i++) {
            for (int s = 0; s < multiArray[i].length; s++) {
                for (int k = 0; k < multiArray[i][s].length; k++) {
                    System.out.print(multiArray[i][s][k] + " ");
                }
            }
        }
        //напишите тут ваш код
    }
}
