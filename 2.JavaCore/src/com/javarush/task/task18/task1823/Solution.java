package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.*;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<>();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String fileName = reader.readLine();
            while (!fileName.equals("exit")){
                new ReadThread(fileName).start();
                fileName = reader.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            try (FileInputStream fileInputStream = new FileInputStream(fileName)){
                List<Integer> list = new ArrayList<>();
                while (fileInputStream.available() > 0){
                    list.add(fileInputStream.read());
                }
                int frequencyCount = 0;
                int wantedElement = 0;
                for (int item : list){
                    int freq = Collections.frequency(list, item);
                    if (freq > frequencyCount){
                        wantedElement = item;
                        frequencyCount = freq;
                    }
                }
                resultMap.put(fileName, wantedElement);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}