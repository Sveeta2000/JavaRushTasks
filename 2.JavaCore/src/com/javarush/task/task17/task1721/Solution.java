package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<>();
    public static List<String> forRemoveLines = new ArrayList<>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String fileName1 = reader.readLine();
            String fileName2 = reader.readLine();
            BufferedReader fileReader1 = new BufferedReader(new FileReader(fileName1));
            BufferedReader fileReader2 = new BufferedReader(new FileReader(fileName2));
            while (fileReader1.ready()){
                allLines.add(fileReader1.readLine());
            }
            while (fileReader2.ready()){
                forRemoveLines.add(fileReader2.readLine());
            }
            fileReader1.close();
            fileReader2.close();
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Solution s = new Solution();
        try{
            s.joinData();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void joinData() throws CorruptedDataException {
        for (String removeLine : forRemoveLines) {
            if (!allLines.contains(removeLine)) {
                allLines.clear();
                throw new CorruptedDataException();
            }
        }
        allLines.removeAll(forRemoveLines);
    }
}
