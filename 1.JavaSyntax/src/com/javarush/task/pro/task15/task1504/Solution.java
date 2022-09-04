package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             InputStream inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
             OutputStream outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))
        ) {

            byte[] buffer = inputStream.readAllBytes();
            int bufLength = buffer.length;
            byte[] answer = new byte[bufLength];

                if (bufLength %2 == 0) {
                    for (int i = 0; i < bufLength; i +=2) {
                        answer[i] = buffer[i+1];
                        answer[i+1] = buffer[i];
                    }

                } else {
                    for (int i = 0; i < bufLength-1; i +=2) {
                        answer[i] = buffer[i+1];
                        answer[i+1] = buffer[i];
                    }
                    answer[bufLength-1] = buffer[bufLength-1];
                }


            outputStream.write(answer, 0, answer.length);

        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

