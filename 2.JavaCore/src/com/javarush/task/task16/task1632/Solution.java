package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new ThreadOne());
        threads.add(new ThreadTwo());
        threads.add(new ThreadThree());
        threads.add(new ThreadFour());
        threads.add(new ThreadFive());
    }

    public static void main(String[] args) {

    }


    public static class ThreadOne extends Thread{
        @Override
        public void run() {
            while (true){

            }
        }
    }

    public static class ThreadTwo extends Thread{
        @Override
        public void run() {
            try {
                throw new InterruptedException();
            }catch (InterruptedException e){
                System.out.println("InterruptedException");
            }
        }
    }

    public static class ThreadThree extends Thread{
        @Override
        public void run() {
            while (true){
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static class ThreadFour extends Thread implements Message{

        private boolean going = true;
        @Override
        public void run() {
            while (going){

            }

        }

        @Override
        public void showWarning() {
            going = false;
        }
    }

    public static class ThreadFive extends Thread{

        @Override
        public void run() {
            int newNumber;
            String newString;
            int sum = 0;
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try{
                newString = reader.readLine();
                while (!newString.equals("N")){
                    newNumber = Integer.parseInt(newString);
                    sum += newNumber;
                    newString = reader.readLine();
                }
                System.out.println(sum);

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}