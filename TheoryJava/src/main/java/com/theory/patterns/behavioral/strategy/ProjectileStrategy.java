package com.theory.patterns.behavioral.strategy;

/**
 * @author sveet
 * @date 30.03.2023
 */
public class ProjectileStrategy implements DragonSlayingStrategy {
    @Override
    public void execute() {
        System.out.println("You shoot the dragon with the magical crossbow and it falls dead on the ground!");
    }
}
