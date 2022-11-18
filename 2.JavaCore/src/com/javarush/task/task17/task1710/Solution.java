package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {

        switch (args[0]){
            case "-c" :                      //creating a person
                Person person = null;
                if (args[2].equals("м")){
                    person = Person.createMale(args[1], parseToDate(args[3]));
                } else if (args[2].equals("ж")){
                    person = Person.createFemale(args[1], parseToDate(args[3]));
                }
                allPeople.add(person);
                System.out.println(allPeople.size()-1);
                break;

            case "-r" :                      //printing info about a person
                person = allPeople.get(Integer.parseInt(args[1]));
                String sex = null;
                if (person.getSex().equals(Sex.MALE)){
                    sex = "м";
                } else if (person.getSex().equals(Sex.FEMALE)){
                    sex = "ж";
                }
                System.out.println(person.getName() + " " + sex + " " + dateToString(person.getBirthDate()));
                break;

            case "-u" :                          //updating info about a person
                person = allPeople.get(Integer.parseInt(args[1]));
                person.setName(args[2]);
                if (args[3].equals("м")){
                    person.setSex(Sex.MALE);
                }else if (args[3].equals("ж")){
                    person.setSex(Sex.FEMALE);
                }
                person.setBirthDate(parseToDate(args[4]));
                break;

            case "-d" :                        //deleting a person
                person = allPeople.get(Integer.parseInt(args[1]));
                person.setName(null);
                person.setSex(null);
                person.setBirthDate(null);
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
