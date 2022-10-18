package com.training.palindrome;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author sveet
 * @date 20.09.2022
 */
public class Solution {

    public static boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        ArrayList<Integer> reversed = new ArrayList<>();
        while (x>0){
            reversed.add(x%10);
            x = x/10;
        }
        Object[] arrayReversed = reversed.toArray();
        Object[] array = Arrays.copyOf(arrayReversed, arrayReversed.length);
        for(int i =0; i < array.length/2; i++){
            Object o = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = o;
        }
        return Arrays.equals(array, arrayReversed);

    }


    public static void main(String[] args) {
        System.out.println(isPalindrome(1122332211));
        System.out.println(isPalindrome(12322));
        System.out.println(isPalindrome(111));
        System.out.println(isPalindrome(10));
    }
}
