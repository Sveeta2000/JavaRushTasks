package com.javarush.task.task19.task1927;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Контекстная реклама
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream original = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        String advertisement = "JavaRush - курсы Java онлайн\n";
        testString.printSomething();
        String str = outputStream.toString();
        String[] arrayOfLines = str.split("\\n");
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < arrayOfLines.length; i++) {
            result.append(arrayOfLines[i] + "\n");
            if(i%2==1){
                result.append(advertisement);
            }
        }
        System.setOut(original);
        System.out.println(result.toString().trim());
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
