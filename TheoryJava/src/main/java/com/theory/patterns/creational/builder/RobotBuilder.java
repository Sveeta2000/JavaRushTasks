package com.theory.patterns.creational.builder;

/**
 * @author sveet
 * @date 25.11.2022
 */
public class RobotBuilder {

    private RobotBuilder() {
    }

    public static WithName buildRobot() {
        return new WithName() {

            @Override
            public WithId withName(String name) {
                return new WithId() {

                    @Override
                    public Robot withId(long id) {
                        Robot robot = new Robot();
                        robot.setName(name);
                        robot.setId(id);
                        return robot;
                    }
                };
            }
        };
    }

    public interface WithName {
        WithId withName(String name);
    }

    public interface WithId {
        Robot withId(long id);
    }
}
