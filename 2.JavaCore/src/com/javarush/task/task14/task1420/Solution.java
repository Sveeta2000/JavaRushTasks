package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int x = Integer.parseInt(reader.readLine());
       int y = Integer.parseInt(reader.readLine());

        System.out.println(getNod(x, y));
    }

    private static int getNod(int x, int y){
        int nod = 1;
        for (int i = 1; i < Math.min(x, y)+1; i++){
            if ((x%i == 0) && (y%i == 0)){
                nod = i;
            }
        }
        return nod;
    }
}
