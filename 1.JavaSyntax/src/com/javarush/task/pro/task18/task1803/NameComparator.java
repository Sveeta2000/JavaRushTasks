package com.javarush.task.pro.task18.task1803;

import java.util.Comparator;

/* 
Наставники JavaRush
*/

public class NameComparator implements Comparator<JavaRushMentor>{
    public int compare (JavaRushMentor jrm1, JavaRushMentor jrm2) {
        return jrm1.getName().length() - jrm2.getName().length();
    }
}
