package com.training.removeElement;

import java.util.Arrays;

/**
 * @author sveet
 * @date 05.10.2022
 */
public class Solution {
    public static int removeElement(int[] nums, int val) {
        int count = nums.length;
        int swapCount = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == val){
                count--;
                nums[i] = nums[nums.length-1-swapCount];
                nums[nums.length-1-swapCount] = -1;
                swapCount += 1;
                i--;
            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        int[] n = {4,4,0,1,0,1};
        int v = 1;
        int result = removeElement(n, v);
        System.out.println("result is " + result);
    }
}
