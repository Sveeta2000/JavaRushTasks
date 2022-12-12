package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(args[0]))){
            while (reader.ready()){
                String line = reader.readLine();
                list.add(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        for(String line : list){
            String[] items = line.split(" ");
            int length = items.length;
            int year = Integer.parseInt(items[length-1]);
            int month = Integer.parseInt(items[length-2])-1;
            int day = Integer.parseInt(items[length-3]);
            StringBuilder name = new StringBuilder();
            for (int i = 0; i < length-3; i++) {
                name.append(items[i] + " ");
            }
            Calendar birthday = new GregorianCalendar(year, month, day);
            PEOPLE.add(new Person(name.toString().trim(), birthday.getTime()));

        }

    }
}
