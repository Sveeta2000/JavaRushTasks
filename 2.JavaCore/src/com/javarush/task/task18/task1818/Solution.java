package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedOutputStream file1 = new BufferedOutputStream(new FileOutputStream(reader.readLine(), true));
        BufferedInputStream file2 = new BufferedInputStream(new FileInputStream(reader.readLine()));
        BufferedInputStream file3 = new BufferedInputStream(new FileInputStream(reader.readLine()))
        ){
           int i;
           while ((i = file2.read()) != -1){
               file1.write(i);
           }
           while ((i = file3.read()) != -1){
               file1.write(i);
           }

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
