package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> randomSet = new HashSet<>();
        try{
            FileInputStream fileInputStream = new FileInputStream(reader.readLine());
            reader.close();
            while (fileInputStream.available() > 0){
                randomSet.add(fileInputStream.read());
            }
            fileInputStream.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        TreeSet<Integer> orderedSet = new TreeSet<>(randomSet);
        for (int instance : orderedSet){
            System.out.print(instance + " ");
        }
    }
}
