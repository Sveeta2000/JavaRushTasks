package com.javarush.task.task14.task1417;

/**
 * @author sveet
 * @date 18.10.2022
 */
public class Ruble extends Money{
    public Ruble(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "RUB";
    }
}
