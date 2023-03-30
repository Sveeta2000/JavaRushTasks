package com.theory.patterns.behavioral.strategy;

/**
 * @author sveet
 * @date 30.03.2023
 */
public class SpellStrategy implements DragonSlayingStrategy {
    @Override
    public void execute() {
        System.out.println("You cast the spell of disintegration and the dragon vaporizes in a pile of dust!");
    }
}
