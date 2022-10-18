package com.javarush.task.task14.task1408;

/**
 * @author sveet
 * @date 13.10.2022
 */
public class MoldovanHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 40;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
