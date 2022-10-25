package com.javarush.task.task15.task1522;

/**
 * @author sveet
 * @date 24.10.2022
 */
public class Earth implements Planet{
    private static Earth instance;
    private Earth(){}
    public static Earth getInstance(){
        if (instance == null){
            instance = new Earth();
        }
        return instance;
    }
}
