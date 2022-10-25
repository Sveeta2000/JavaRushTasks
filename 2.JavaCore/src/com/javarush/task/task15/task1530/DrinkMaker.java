package com.javarush.task.task15.task1530;

/**
 * @author sveet
 * @date 21.10.2022
 */
public abstract class DrinkMaker {

    abstract void getRightCup();
    abstract void putIngredient();
    abstract void pour();
    void makeDrink(){
        getRightCup();
        putIngredient();
        pour();
    }
}
