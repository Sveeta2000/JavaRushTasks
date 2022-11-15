package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            FileInputStream file1 = new FileInputStream(reader.readLine());
            FileOutputStream file2 = new FileOutputStream(reader.readLine());
            FileOutputStream file3 = new FileOutputStream(reader.readLine());
            reader.close();
            byte[] bufferOdd = new byte[file1.available()/2 +1];
            byte[] bufferEven = new byte[file1.available()/2];
            int length = file1.available();
            if (file1.available()%2 == 1){
                while ((file1.available() > 0) && (file1.available() > length/2)){
                    file1.read(bufferOdd);
                    file2.write(bufferOdd);
                }
            } else if (file1.available()%2 == 0){
                while ((file1.available() > 0) && (file1.available() > length/2)){
                    file1.read(bufferEven);
                    file2.write(bufferEven);
                }
            }
            while (file1.available() > 0){
                file1.read(bufferEven);
                file3.write(bufferEven);
            }
            file1.close();
            file2.close();
            file3.close();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
