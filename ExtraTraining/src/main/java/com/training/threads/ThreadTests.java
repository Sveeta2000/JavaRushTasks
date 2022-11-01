package com.training.threads;

/**
 * @author sveet
 * @date 25.10.2022
 */
public class ThreadTests {
    public static void main(String[] args) {
        /*
        There are two ways to create an additional tread in your code
        1 - create a class that extends class Thread and override its method "run"
            use method start to launch the new thread in your main thread
        2 - create a class that implements interface Runnable AND implements is method "run"
             put its object into the Thread type variable like this:
             Thread thread = new Thread(new Runner());

        Remember that these threads are NOT synchronised!
         */

        MyThread myThread = new MyThread();
        myThread.start();

        NextThread nextThread = new NextThread();
        nextThread.start();

        for (int i = 0; i <15; i++){
            System.out.println("Hello from main thread!");
        }
        for (int i = 0; i<10; i++){
            System.out.println("Bye!");
        }

        LastThread lastThread = new LastThread();
        lastThread.start();
        Thread thread = new Thread(new Runner());
        thread.start();
    }
}

class MyThread extends Thread{
    public void run (){
        for (int i = 1; i<11; i++){
            System.out.println(i + " - Hi from MyThread!");
        }
    }
}

class Runner implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i<11; i++){
            System.out.println(i + " - Hi, I'm Runner!");
        }
    }
}

class NextThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i<51; i++){
            System.out.println("NextThread is here - " + i);
        }
    }
}

class LastThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i<51; i++){
            System.out.println(i + " - LastThread - " + i);
        }
    }
}
