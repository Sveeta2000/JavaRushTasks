package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

public class MinMaxUtil {

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static int max(int a, int b, int c) {
        int max = Math.max(a, b);
        return Math.max(max, c);
    }

    public static int max(int a, int b, int c, int d) {
        int max = Math.max(a, b);
        max = Math.max(max, d);
        return Math.max(max, c);
    }

    public static int max(int a, int b, int c, int d, int e) {
        int max = Math.max(a, b);
        max = Math.max(max, d);
        max = Math.max(max, e);
        return Math.max(max, c);
    }

    // min methods start here

    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    public static int min(int a, int b, int c) {
        int min = Math.min(a, b);
        return Math.min(min, c);
    }

    public static int min(int a, int b, int c, int d) {
        int min = Math.min(a, b);
        min = Math.min(min, d);
        return Math.min(min, c);
    }

    public static int min(int a, int b, int c, int d, int e) {
        int min = Math.min(a, b);
        min = Math.min(min, d);
        min = Math.min(min, e);
        return Math.min(min, c);
    }


}
