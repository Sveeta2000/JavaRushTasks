package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream original = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        testString.printSomething();
        String str = outputStream.toString();
        String [] strArray = str.split(" ");
        int answer = 0;
        int a = Integer.parseInt(strArray[0]);
        int b = Integer.parseInt(strArray[2]);
        switch (strArray[1]){
            case "+" :
                answer = a + b;
                break;
            case "-" :
                answer = a - b;
                break;
            case "*" :
                answer = a*b;
        }
        System.setOut(original);
        String result = str.trim().concat(" " + answer);
        System.out.print(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

