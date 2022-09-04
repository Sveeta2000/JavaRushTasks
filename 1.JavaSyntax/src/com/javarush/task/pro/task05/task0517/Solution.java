package com.javarush.task.pro.task05.task0517;

import java.util.Arrays;

/* 
Делим массив
*/

public class Solution {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {
        if (array.length%2 == 1){
            int [] one = Arrays.copyOfRange(array, 0, array.length/2 + 1);
            int [] two = Arrays.copyOfRange(array, array.length/2 +1, array.length);
            result [0] = one;
            result [1] = two;
        } else {
            int [] one = Arrays.copyOfRange(array, 0, array.length/2);
            int [] two = Arrays.copyOfRange(array, array.length/2, array.length);
            result [0] = one;
            result [1] = two;
        }
        //напишите тут ваш код
        System.out.println(Arrays.deepToString(result));
    }
}
