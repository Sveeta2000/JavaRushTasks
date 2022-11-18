package com.javarush.task.task17.task1711;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        switch (args[0]){
            case "-c" :                      //creating a person
                synchronized (allPeople){
                    Person person = null;
                    for (int i = 1; i < args.length; i++) {
                        if (args[i+1].equals("м")){
                            person = Person.createMale(args[i], parseToDate(args[i+2]));
                        } else if (args[i+1].equals("ж")){
                            person = Person.createFemale(args[i], parseToDate(args[i+2]));
                        }
                        allPeople.add(person);
                        System.out.println(allPeople.size()-1);
                        i++;
                        i++;
                    }
                }
                break;

            case "-i" :                    //printing info about a person
                synchronized (allPeople){
                    Person person;
                    String sex = null;
                    for (int i = 1; i < args.length; i++) {
                        person = allPeople.get(Integer.parseInt(args[i]));
                        if (person.getSex().equals(Sex.MALE)){
                            sex = "м";
                        } else if (person.getSex().equals(Sex.FEMALE)){
                            sex = "ж";
                        }
                        System.out.println(person.getName() + " " + sex + " " + dateToString(person.getBirthDate()));
                    }
                }
                break;

            case "-u" :                   //updating info about a person
                synchronized (allPeople){
                    for (int i = 1; i < args.length; i++) {
                        Person person;
                        person = allPeople.get(Integer.parseInt(args[i]));
                        i++;
                        person.setName(args[i]);
                        i++;
                        if (args[i].equals("м")){
                            person.setSex(Sex.MALE);
                        }else if (args[i].equals("ж")){
                            person.setSex(Sex.FEMALE);
                        }
                        i++;
                        person.setBirthDate(parseToDate(args[i]));
                    }
                }
                break;

            case "-d" :                    //deleting a person
                synchronized (allPeople){
                    Person person;
                    for (int i = 1; i < args.length; i++) {
                        person = allPeople.get(Integer.parseInt(args[i]));
                        person.setName(null);
                        person.setSex(null);
                        person.setBirthDate(null);
                    }
                }
                break;
        }
    }

    public static Date parseToDate(String strDate){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        try {
            return sdf.parse(strDate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static String dateToString(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        return sdf.format(date);
    }
}