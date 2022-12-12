package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file = new BufferedReader(new FileReader(reader.readLine()))){

            while (file.ready()){
                int count = 0;
                String line = file.readLine();
                String [] wordArray = line.split(" ");
                for (int i = 0; i < wordArray.length; i++) {
                    for (String word : words){
                        if(word.equals(wordArray[i])){
                            count++;
                            break;
                        }
                    }
                    if (count > 2){
                        break;
                    }
                }
                if(count == 2){
                    System.out.println(line);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
