package com.training.array;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int currentIndex = (right - left) / 2 + left;
            int numI = nums[currentIndex];
            if (numI == target) {
                left = currentIndex;
                right = currentIndex;
            } else if (target < numI) {
                right = Math.max(0, currentIndex - 1);

            } else if (target > numI) {
                left = currentIndex + 1;
            }
        }
        int numI = nums[left];

        return numI == target ? left
                : numI > target && left == 0 ? 0
                : numI > target ? left
                : left + 1;
    }


}
