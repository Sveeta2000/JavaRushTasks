package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        try(FileInputStream file1 = new FileInputStream(reader.readLine());
        FileOutputStream file2 = new FileOutputStream(reader.readLine())){
            while (file1.available()>0){
                list.add(file1.read());
            }
            Collections.reverse(list);
            for (int item : list){
                file2.write(item);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
