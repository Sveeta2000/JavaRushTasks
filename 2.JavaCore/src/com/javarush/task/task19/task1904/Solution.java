package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner scanner){
            this.fileScanner = scanner;
        }

        @Override
        public Person read() throws IOException {
            if (fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                String[] info = line.split(" ");      //whitespaces can be written as "\s+"

                int year = Integer.parseInt(info[5]);       //parsing the date
                int month = Integer.parseInt(info[4])-1;
                int day = Integer.parseInt(info[3]);
                Date birthday = new Date(year-1900, month, day);

                String lastName = info[0];                  //parsing the names
                String name = info[1];
                String middleName = info[2];
                return new Person(name,middleName, lastName, birthday);
            } else {
                return null;
            }
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
