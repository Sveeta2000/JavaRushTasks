package com.theory.patterns.creational.factorymethod;

/**
 * @author sveet
 * @date 31.03.2023
 */
public class GoldGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        System.out.println("Gold was created");
        return new Gold();
    }
}
