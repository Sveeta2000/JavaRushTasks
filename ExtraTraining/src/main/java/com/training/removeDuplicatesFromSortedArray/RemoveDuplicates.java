package com.training.removeDuplicatesFromSortedArray;

import java.util.Set;
import java.util.TreeSet;

/* Constraints:
1 <= nums.length <= 3 * 104
-100 <= nums[i] <= 100
nums is sorted in non-decreasing order.
 */

/**
 * @author sveet
 * @date 31.01.2023
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] array = {1, 1, 1, 2, 4};
        System.out.println(removeDuplicates(array));
    }

    public static int removeDuplicates(int[] nums) {
        Set<Integer> originalNumbers = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!originalNumbers.contains(nums[i])){
                originalNumbers.add(nums[i]);
            }
        }
        int i = 0;
        for (int number : originalNumbers) {
            nums[i] = number;
            i++;
        }
        return originalNumbers.size();
    }
}
