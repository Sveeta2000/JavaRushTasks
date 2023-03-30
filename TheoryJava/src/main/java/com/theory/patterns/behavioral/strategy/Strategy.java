package com.theory.patterns.behavioral.strategy;

/**
 * @author sveet
 * @date 30.03.2023
 */
public class Strategy {

    public static void main(String[] args) {
        System.out.println("Green dragon spotted ahead!");
        DragonSlayer slayer = new DragonSlayer(new SpellStrategy());
        slayer.goToBattle();
        System.out.println("Red dragon emerges.");
        slayer.changeStrategy(new ProjectileStrategy());
        slayer.goToBattle();
    }
}
