package com.javarush.task.pro.task16.task1607;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/* 
Освоение нового API
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {

        return LocalDate.now();
    }

    static LocalDate ofExample() {
        //напишите тут ваш код

        return LocalDate.of(2020, 9, 12);
    }

    static LocalDate ofYearDayExample() {
        LocalDate sept = LocalDate.of(2020, 9, 12);
        int dayOfYear = sept.getDayOfYear();

        return LocalDate.ofYearDay(2020, dayOfYear);
    }

    static LocalDate ofEpochDayExample() {
        LocalDate sept = LocalDate.of(2020, 9, 12);
        LocalDate start = LocalDate.ofEpochDay(0);

        return LocalDate.ofEpochDay(ChronoUnit.DAYS.between(start, sept));
    }
}
