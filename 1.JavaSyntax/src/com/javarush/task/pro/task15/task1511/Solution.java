package com.javarush.task.pro.task15.task1511;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Пишем символы в файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        char[] chars = args[0].toCharArray();
        BufferedWriter ww = null;
        try (InputStream stream = System.in;
             Scanner scanner = new Scanner(stream)

        ) {
            ww = Files.newBufferedWriter(Path.of(scanner.nextLine()));
            ww.write(chars);
            //Files.write(Path.of(scanner.nextLine()), chars);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        } finally {
            if (ww != null) {
                ww.close();
            }

        }
    }
}


