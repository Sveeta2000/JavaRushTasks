package com.training.lastWordLength;

/**
 * @author sveet
 * @date 07.02.2023
 */
public class Solution {
    public static int lengthOfLastWord(String s) {
        StringBuilder sb = new StringBuilder(s.trim());
        sb.reverse();
        int index;
        if ((index = sb.indexOf(" ")) > 0){
            return index;
        } else {
            return sb.length();
        }
    }
}
