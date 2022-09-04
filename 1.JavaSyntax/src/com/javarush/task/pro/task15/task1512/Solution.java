package com.javarush.task.pro.task15.task1512;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

/* 
Задом наперед
*/

public class Solution {
    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(outputStream);

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        printSomething(scanner.nextLine());
        String result = outputStream.toString();

        StringBuffer stringBuffer = new StringBuffer(result);
        outputStream.reset();
        printSomething(stringBuffer.reverse().toString());
        System.out.println(outputStream);


        /*   тоже работает, но не подходит условию:

        char[] original = result.toCharArray();
        char[] reverse = new char[original.length];

        for (int i = original.length - 1; i >=0; i--){
            reverse[original.length - (i + 1)] = original[i];
        }
        outputStream.reset();
        String newResult = Arrays.toString(reverse);
        printSomething(newResult);
        System.out.println(newResult);
         */

    }

    public static void printSomething(String str) {
        stream.print(str);
    }
}