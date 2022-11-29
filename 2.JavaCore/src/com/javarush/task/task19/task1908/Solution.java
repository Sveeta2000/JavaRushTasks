package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader reader = new BufferedReader(new FileReader(br.readLine()));
            BufferedWriter writer = new BufferedWriter(new FileWriter(br.readLine()))){

            while (reader.ready()){
                String line = reader.readLine();
                for(String item : line.split("\\s")){
                    if (!item.matches("(.*)\\D(.*)")){
                        try{
                            int number = Integer.parseInt(item);
                            listOfNumbers.add(number);
                        }catch (Exception ignore){
                        }

                    }
                }
            }
            for(Integer num : listOfNumbers){
                writer.write(num + " ");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
