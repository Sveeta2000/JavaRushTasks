package com.theory.patterns.creational.factorymethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sveet
 * @date 31.03.2023
 */
public class Main {
    public static void main(String[] args) {
        List<ItemGenerator> generators = new ArrayList<>();
        generators.add(new GoldGenerator());
        generators.add(new GemGenerator());
        for (ItemGenerator gen : generators) {
            gen.openReward();
        }
    }
}
