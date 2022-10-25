package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        reset();
    }

    public static CanFly result;

    public static void reset() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = reader.readLine();
            if ("helicopter".equals(str)){
                result = new Helicopter();
            } else if ("plane".equals(str)){
                int passengers = Integer.parseInt(reader.readLine());
                result = new Plane(passengers);
            }
            reader.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
