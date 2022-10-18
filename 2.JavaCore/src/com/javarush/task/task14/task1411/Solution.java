package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        do {
            key = reader.readLine();
            switch (key) {
                case "user" -> person = new Person.User();
                case "loser" -> person = new Person.Loser();
                case "coder" -> person = new Person.Coder();
                case "proger" -> person = new Person.Proger();
            }
            if (key.equals("user") || key.equals("loser") || key.equals("coder") || key.equals("proger"))
            {
                doWork(person);
            }
        } while (key.equals("user") || key.equals("loser") || key.equals("coder") || key.equals("proger"));


    }

    public static void doWork(Person person) {
        if (person instanceof Person.User){
            ((Person.User) person).live();
        } else if ( person instanceof Person.Loser){
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder){
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Proger){
            ((Person.Proger) person).enjoy();
        }
    }
}
