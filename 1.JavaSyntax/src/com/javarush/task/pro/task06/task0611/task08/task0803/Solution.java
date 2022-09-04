package com.javarush.task.pro.task06.task0611.task08.task0803;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;

/* 
Минимальный элемент массива
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        int min = MAX_VALUE;
        for (int i = 0; i <10; i++) {
            min = Math.min(min, ints [i]);
        }

        //напишите тут ваш код
        return min;
    }

    public static int[] getArrayOfTenElements() {
        Scanner console = new Scanner(System.in);
        int [] array = new int [10];
        for (int i = 0; i < 10; i++){
            array[i] = console.nextInt();
        }
        //напишите тут ваш код
        return array;
    }
}
