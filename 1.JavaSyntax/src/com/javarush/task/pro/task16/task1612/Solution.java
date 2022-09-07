package com.javarush.task.pro.task16.task1612;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

/* 
Синтезируем LocalDateTime
*/

public class Solution {

    public static void main(String[] args) {
        Map<LocalDate, List<LocalTime>> dateMap = DateTimeGenerator.generateDateMap();
        printCollection(dateMap.entrySet());

        Set<LocalDateTime> dateSet = convert(dateMap);
        printCollection(dateSet);
    }

    static Set<LocalDateTime> convert(Map<LocalDate, List<LocalTime>> sourceMap) {
        Set<LocalDateTime> converted = new HashSet<>();
        Set<LocalDate> dates = sourceMap.keySet();
        for ( LocalDate entry : dates) {
            List<LocalTime> timeList = sourceMap.get(entry);
            for (LocalTime timeEntry : timeList) {
                LocalDateTime dateTime = LocalDateTime.of(entry, timeEntry);
                converted.add(dateTime);
            }

        }

        return converted;
    }

    static void printCollection(Collection<?> collection) {
        System.out.println("-----------------------------------------------------");
        collection.forEach(System.out::println);
    }
}