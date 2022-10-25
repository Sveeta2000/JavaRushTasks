package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try{
            String str = reader.readLine();
            while (! "exit".equals(str)) {

                if (isDouble(str)){
                    print(Double.parseDouble(str));
                }
                else if (isShort(str)){
                    print(Short.parseShort(str));
                }
                else if (isInt(str)){
                    print(Integer.parseInt(str));
                } else {
                    print(str);
                }
                str = reader.readLine();
                if ("exit".equals(str)){
                    reader.close();
                }
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }

    public static boolean isDouble(String str){
        if (str.contains(".")){
            try {
                Double db = Double.parseDouble(str);
            } catch (Exception e){
                return false;
            }

            return true;
        } else {
            return false;
        }

    }

    public static boolean isShort(String str){
        int n;
        try {
            n = Integer.parseInt(str);

        } catch (Exception e){
            return false;
        }
        return n > 0 && n < 128;

    }

    public static boolean isInt(String str){
        try {
            int n = Integer.parseInt(str);
        } catch (Exception e){
            return false;
        }
        return true;
    }

}
