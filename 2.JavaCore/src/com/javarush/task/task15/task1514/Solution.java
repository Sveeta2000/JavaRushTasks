package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static{
        labels.put(12.3, "Cat");
        labels.put(13.4, "Sat");
        labels.put(14.5, "Fat");
        labels.put(15.6, "Bat");
        labels.put(16.7, "Rat");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
