package com.javarush.task.task14.task1408;

/**
 * @author sveet
 * @date 13.10.2022
 */
public abstract class Hen {

    abstract int getCountOfEggsPerMonth();

    String getDescription(){
        return "Я - курица.";
    }
}
