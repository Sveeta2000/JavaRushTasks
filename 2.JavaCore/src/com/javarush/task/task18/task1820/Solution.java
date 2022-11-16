package com.javarush.task.task18.task1820;

import java.io.*;


/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader firstFile = new BufferedReader(new FileReader(reader.readLine()));
            PrintWriter secondFile = new PrintWriter(new FileWriter(reader.readLine()))
        ){
           while (firstFile.ready()){
               String[] line = firstFile.readLine().split(" ");
               for( String number : line){
                   double d = Double.parseDouble(number);
                   long roundedNumber = Math.round(d);
                   secondFile.print(roundedNumber + " ");
               }
           }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
