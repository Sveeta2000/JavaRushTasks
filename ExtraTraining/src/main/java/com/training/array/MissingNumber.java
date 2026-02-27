package com.training.array;

/**
 * Given an array arr[] of size n-1 with distinct integers in the range of [1, n].
 * This array represents a permutation of the integers from 1 to n with one element missing.
 * Find the missing element in the array.
 *
 * Examples:
 * Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
 * Output: 6
 * Explanation: All the numbers from 1 to 8 are present except 6.
 *
 * Input: arr[] = [1, 2, 3, 5]
 * Output: 4
 * Explanation: Here the size of the array is 4, so the range will be [1, 5]. The missing number between 1 and 5 is 4
 */
public class MissingNumber {

    // O(n) Time and O(1) Space
    public int findTheMissingNumberBySumming(int[] arr) {
        int n = arr.length + 1;
        long targetSum = n * (n + 1) / 2; //sum formula for natural numbers from 1 to n
        long realSum = 0;
        for (int j : arr) {
            realSum += j;
        }
        return (int) (targetSum - realSum);
    }

    public int findTheMissingNumberByXor(int[] arr) {
        int n = 1;
        int missingNum = 0;
        for (int i = 0; i < arr.length; i++) {
            missingNum = missingNum ^ n ^ arr[i];
            n++;
        }
        return missingNum;
    }
}
