package com.javarush.task.task15.task1522;

/**
 * @author sveet
 * @date 24.10.2022
 */
public class Sun implements Planet{
    private static Sun instance;
    private Sun(){}

    public static Sun getInstance(){
        if (instance == null){
            instance = new Sun();
        }
        return instance;
    }
}
