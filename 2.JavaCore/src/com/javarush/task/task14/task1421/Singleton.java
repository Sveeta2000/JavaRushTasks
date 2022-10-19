package com.javarush.task.task14.task1421;

/**
 * @author sveet
 * @date 19.10.2022
 */
public class Singleton {

    private static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }

    private Singleton() {
    }
}
