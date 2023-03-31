package com.theory.patterns.creational.factorymethod;

/**
 * @author sveet
 * @date 31.03.2023
 */
public class Gold implements GameItem {
    @Override
    public void open() {
        System.out.println("Gold reward opened");
    }
}
