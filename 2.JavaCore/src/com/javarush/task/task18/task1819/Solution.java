package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String firstName = reader.readLine();
            String secondName = reader.readLine();

            //creating a copy of info from the 1st file
            BufferedInputStream firstFileToRead = new BufferedInputStream(new FileInputStream(firstName));
            byte[] buffer = new byte[firstFileToRead.available()];
            while (firstFileToRead.available() > 0){
                firstFileToRead.read(buffer);
            }
            firstFileToRead.close();

            //creating the streams to write to and from
            BufferedOutputStream toFile = new BufferedOutputStream(new FileOutputStream(firstName));
            BufferedInputStream fromFile = new BufferedInputStream(new FileInputStream(secondName));

            //writing from the second file into the first, then from buffer into the first
            int i;
            while ((i = fromFile.read()) != -1){
                toFile.write(i);
            }
            toFile.write(buffer);

            //closing the streams
            toFile.close();
            fromFile.close();

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
