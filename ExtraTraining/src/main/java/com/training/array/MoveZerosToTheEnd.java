package com.training.array;

import java.util.Arrays;

/**
 *Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 * Example 1:
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 *
 * Example 2:
 * Input: nums = [0]
 * Output: [0]
 *
 * Constraints:
 * 1 <= nums.length <= 104
 * -231 <= nums[i] <= 231 - 1
 */
public class MoveZerosToTheEnd {

    //slow
    public void moveZeroes(int[] nums) {
        int[] array = Arrays.stream(nums).filter(i -> i != 0).toArray();
        for (int i = 0; i < nums.length; i++) {
            if (i < array.length) {
                nums[i] = array[i];
            } else {
                nums[i] = 0;
            }
        }
    }

    //nice
    public void moveZeroesV2(int[] nums) {
        int zeroCnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCnt++;
            } else if (zeroCnt > 0) {
                nums[i-zeroCnt] = nums[i];
            }
        }
        for (int i = nums.length-1; i >= nums.length - zeroCnt; i--) {
            nums[i] = 0;
        }
    }

}
