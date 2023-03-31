package com.theory.patterns.creational.factorymethod;

/**
 * @author sveet
 * @date 31.03.2023
 */
public class GemGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        System.out.println("Gem was created");
        return new Gem();
    }
}
