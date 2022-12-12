package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;


/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) {
        TreeMap<String, Double> map = new TreeMap<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(args[0]))){
            while (reader.ready()){
                String line = reader.readLine();
                String[] items = line.split(" ");
                String name = items[0];
                Double money = Double.parseDouble(items[1]);
                if (map.containsKey(name)){
                    map.put(name, map.get(name) + money);
                } else {
                    map.put(name, money);
                }
            }
            Double max = 0.000;
            for (Map.Entry<String, Double> entry : map.entrySet()){
                if (entry.getValue() > max){
                    max = entry.getValue();
                }
            }

            for (Map.Entry<String, Double> entry : map.entrySet()){
                if (entry.getValue().equals(max)){
                    System.out.println(entry.getKey());
                }
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
