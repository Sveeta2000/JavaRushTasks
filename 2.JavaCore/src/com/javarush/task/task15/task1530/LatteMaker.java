package com.javarush.task.task15.task1530;

/**
 * @author sveet
 * @date 21.10.2022
 */
public class LatteMaker extends DrinkMaker{
    @Override
    void getRightCup() {
        System.out.println("Берем чашку для латте");
    }

    @Override
    void putIngredient() {
        System.out.println("Делаем молоко с пенкой");
    }

    @Override
    void pour() {
        System.out.println("Заливаем кофе");
    }
}
