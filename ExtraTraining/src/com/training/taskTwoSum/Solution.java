package com.training.taskTwoSum;

import java.util.Arrays;

/**
 * @author sveet
 * @date 20.09.2022
 */
public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        for (int i = 0; i< nums.length-1; i++){
            for(int j = i+1; j< nums.length; j++){
                if (nums[i]+nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] i = new int[]{2, 5, 5, 11};
        System.out.println(Arrays.toString(twoSum(i, 10)));
    }
}
