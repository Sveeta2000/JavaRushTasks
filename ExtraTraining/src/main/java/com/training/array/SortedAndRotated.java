package com.training.array;

/**
 * Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero).
 * Otherwise, return false.
 * There may be duplicates in the original array.
 * Note: An array A rotated by x positions results in an array B of the same length such that B[i] == A[(i+x) % A.length] for every valid index i.
 * Example 1:
 * Input: nums = [3,4,5,1,2]
 * Output: true
 * Explanation: [1,2,3,4,5] is the original sorted array.
 * You can rotate the array by x = 2 positions to begin on the element of value 3: [3,4,5,1,2].
 * Example 2:
 * Input: nums = [2,1,3,4] [7,3,2]
 * Output: false
 * Explanation: There is no sorted array once rotated that can make nums.
 * Example 3:
 * Input: nums = [1,2,3]
 * Output: true
 * Explanation: [1,2,3] is the original sorted array.
 * You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.
 *
 * Constraints:
 * 1 <= nums.length <= 100
 * 1 <= nums[i] <= 100
 */
public class SortedAndRotated {

    public boolean check(int[] nums) {
        boolean isRotated = false;
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) { // last element
                return isRotated ? nums[i] <= nums[0] : true;
            }
            boolean leftIsBigger = nums[i] > nums[i + 1];
            if (!isRotated) { // еще не было разворота
                isRotated = leftIsBigger;
            } else if (leftIsBigger) { // уже был разворот
                return false;
            }
        }
        return false; // doesn't matter
    }
}
