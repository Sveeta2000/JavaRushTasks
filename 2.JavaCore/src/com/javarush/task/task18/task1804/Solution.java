package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        try{
            FileInputStream fileInputStream = new FileInputStream(reader.readLine());
            reader.close();
            while(fileInputStream.available() > 0){
                list.add(fileInputStream.read());
            }
            fileInputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        for (int instance : list){
            int count = Collections.frequency(list, instance);
            frequencyMap.put(instance, count);
        }
        int minCount = Collections.min(frequencyMap.entrySet(), Map.Entry.comparingByValue()).getValue();
        for (int instance : frequencyMap.keySet()){
            if (frequencyMap.get(instance) == minCount){
                System.out.print(instance + " ");
            }
        }
    }
}
