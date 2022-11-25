package com.theory.patterns.creational.singleton;

/**
 * @author sveet
 * @date 23.11.2022
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }

    //the constructor is "empty" so that no one could create any new singleton instance
    private Singleton() {
    }
}

//Here is another way of initializing the instance
class Sun {
    private static Sun instance;  // we don't create the object here yet in order not to use
                                 // the memory resources if this object won't be needed
    private Sun(){}

    // and here we first check if the instance has been created and if yes - we return it
    // if it hasn't been created yet and is equal to null, we create it and then return it
    public static Sun getInstance(){
        if (instance == null){
            instance = new Sun();
        }
        return instance;
    }
}