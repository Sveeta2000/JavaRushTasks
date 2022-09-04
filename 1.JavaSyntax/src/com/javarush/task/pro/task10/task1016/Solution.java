package com.javarush.task.pro.task10.task1016;

/* 
Прогноз погоды
*/

public class Solution {

    public static void showWeather(City city) {

        System.out.printf("В городе " + city.getName() + " сегодня температура воздуха " + city.getTemperature());

        //напишите тут ваш код
    }

    public static void main(String[] args) {
        City newCity = new City ("Дубай", 40);
        showWeather(newCity);
        //напишите тут ваш код
    }
}
