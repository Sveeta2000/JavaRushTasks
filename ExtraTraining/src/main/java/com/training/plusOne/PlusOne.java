package com.training.plusOne;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author sveet
 * @date 05.10.2022
 */
public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int length = digits.length;

        IntStream stream = Arrays.stream(digits);
        if(stream.allMatch(x -> x==9)){
            int[] copyDigits = new int[length+1];
            Arrays.fill(copyDigits, 0);
            copyDigits[0] = 1;
            return copyDigits;
        } else{
            digits[length-1] += 1;
            if (digits[length-1] == 10){
                for (int i = length-1; i>=0; i--){
                    if (digits[i]==10){
                        digits[i] = 0;
                        digits[i-1] += 1;
                    }
                }
            }
        }
        return digits;
    }

    public static void main(String[] args) {
        int [] dig = {2, 9, 9};
        int [] nin = {9};
        System.out.println(Arrays.toString(plusOne(dig)));
        System.out.println(Arrays.toString(plusOne(nin)));
    }

}
