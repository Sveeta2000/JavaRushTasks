package com.javarush.task.pro.task18.task1805;

import java.util.Comparator;

/**
 * @author sveet
 * @date 09.09.2022
 */
public class StringComparator implements Comparator<String> {
    public int compare (String s1, String s2) {
        return s1.length() - s2.length();
    }
}
