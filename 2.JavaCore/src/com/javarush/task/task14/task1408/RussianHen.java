package com.javarush.task.task14.task1408;

/**
 * @author sveet
 * @date 13.10.2022
 */
public class RussianHen extends Hen{

    @Override
    int getCountOfEggsPerMonth() {
        return 20;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
