package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            FileOutputStream file = new FileOutputStream(bufferedReader.readLine())){
            PrintStream originalOut = System.out;
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(outputStream);
            System.setOut(printStream);
            testString.printSomething();
            System.setOut(originalOut);
            String text = outputStream.toString();
            System.out.println(text);
            byte[] textForFile = outputStream.toByteArray();
            file.write(textForFile);

        }catch (IOException e){
            e.printStackTrace();
        }



    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

