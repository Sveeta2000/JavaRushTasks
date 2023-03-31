package com.theory.patterns.creational.factorymethod;

/**
 * @author sveet
 * @date 31.03.2023
 */
public abstract class ItemGenerator {

    public abstract GameItem createItem();

    public void openReward() {
        GameItem item = createItem();
        System.out.println("Reward is to be opened soon");
        item.open();
    }
}
