package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Svetlana Kashina", 5.0);
        grades.put("Andrei Nasonov", 10.0);
        grades.put("Poly Karas", 4.5);
        grades.put("Ucant Seeme", 2.0);
        grades.put("One More", 3.0);
    }
}
