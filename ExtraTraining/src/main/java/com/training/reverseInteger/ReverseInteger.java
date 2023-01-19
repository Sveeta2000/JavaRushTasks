package com.training.reverseInteger;

/*Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
*/

/**
 * @author sveet
 * @date 19.01.2023
 */

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(1234567892));
        System.out.println(reverse(12000));
        System.out.println(reverse(-12000));

    }

    public static int reverse(int x) {
        StringBuilder number;
        boolean isPositive = true;
        if (x < 0){
            number = new StringBuilder(Integer.toString(-x));
            isPositive = false;
        } else {
            number = new StringBuilder(Integer.toString(x));
        }
        number.reverse();
        while (number.charAt(0) == 0){
            number.delete(0, 0);
        }
        if (!isPositive){
            number.insert(0, "-");
        }
        int result;
        try {
            result = Integer.parseInt(number.toString());
        } catch (Exception e){
            return 0;
        }
        if (result > 0){
            return result < Integer.MAX_VALUE ? result : 0;
        } else {
            return result > Integer.MIN_VALUE ? result : 0;
        }
    }
}
