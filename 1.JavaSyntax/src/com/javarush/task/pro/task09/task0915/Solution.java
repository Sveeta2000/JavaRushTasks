package com.javarush.task.pro.task09.task0915;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer st = new StringTokenizer(query, delimiter);
        int n = st.countTokens();
        String [] result = new String[n];
        while (st.hasMoreTokens()) {
            for (int i = 0; i < n; i++) {
                result [i] = st.nextToken();
            }

        }
        return result;
    }
}
