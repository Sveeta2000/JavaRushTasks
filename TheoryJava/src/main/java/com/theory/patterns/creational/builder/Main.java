package com.theory.patterns.creational.builder;

/**
 * @author sveet
 * @date 25.11.2022
 */
public class Main {
    public static void main(String[] args) {
        Robot robot = RobotBuilder.buildRobot()
                .withName("t1000")
                .withId(123);
    }
}
