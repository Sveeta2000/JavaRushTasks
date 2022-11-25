package com.theory.patterns.structural.decorator;

//this code was copied from gitHub for educational purposes only
//it can help understand the Wrapper(Decorator) pattern
//you can see the original source via the link below
// https://github.com/iluwatar/java-design-patterns/tree/master/decorator

/**
 * @author sveet
 * @date 23.11.2022
 */
public class Decorator {
    public static void main(String[] args) {
        // simple troll
        System.out.println("A simple looking troll approaches.");
        Troll troll = new SimpleTroll();
        troll.attack();
        troll.fleeBattle();
        System.out.println("Simple troll power: " + troll.getAttackPower());

        // change the behavior of the simple troll by adding a decorator
        System.out.println("A troll with huge club surprises you.");
        Troll clubbedTroll = new ClubbedTroll(troll);
        clubbedTroll.attack();
        clubbedTroll.fleeBattle();
        System.out.println("Clubbed troll power: " + clubbedTroll.getAttackPower());
    }
}

 interface Troll {

    void attack();

    int getAttackPower();

    void fleeBattle();

}

class SimpleTroll implements Troll {

    @Override
    public void attack() {
        System.out.println("The troll tries to grab you!");
    }

    @Override
    public int getAttackPower() {
        return 10;
    }

    @Override
    public void fleeBattle() {
        System.out.println("The troll shrieks in horror and runs away!");
    }
}

class ClubbedTroll implements Troll {

    private final Troll decorated;

    public ClubbedTroll(Troll decorated){
        this.decorated = decorated;
    }

    @Override
    public void attack() {
        decorated.attack();
        System.out.println("The troll swings at you with a club!");
    }

    @Override
    public int getAttackPower() {
        return decorated.getAttackPower() + 10;
    }

    @Override
    public void fleeBattle() {
        decorated.fleeBattle();
    }
}