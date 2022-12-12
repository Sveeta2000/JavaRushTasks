package com.javarush.task.task19.task1925;

import java.io.*;


/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))){

            StringBuilder result = new StringBuilder();
            while (reader.ready()){
                String line = reader.readLine();
                String[] items = line.split("[ \n]");
                for (String item : items) {
                    if (item.length()>6){
                        result.append(item);
                        result.append(",");
                    }
                }
            }
            result.deleteCharAt(result.length()-1);
            writer.write(result.toString());
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
