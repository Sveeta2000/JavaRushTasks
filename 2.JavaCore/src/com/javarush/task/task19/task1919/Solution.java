package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) {
        TreeMap<String, Double> people = new TreeMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))){
            while (reader.ready()){
                String line = reader.readLine();
                String[] item = line.split(" ");
                String name = item[0];
                Double salary = Double.parseDouble(item[1]);
                if (people.containsKey(name)){
                    Double sal = people.get(name);
                    people.put(name, sal + salary);
                } else {
                    people.put(name, salary);
                }
            }
            for (Map.Entry<String, Double> entry : people.entrySet()){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
