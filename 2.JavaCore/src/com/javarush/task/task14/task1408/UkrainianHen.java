package com.javarush.task.task14.task1408;

/**
 * @author sveet
 * @date 13.10.2022
 */
public class UkrainianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 30;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
