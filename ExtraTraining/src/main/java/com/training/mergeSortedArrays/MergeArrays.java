package com.training.mergeSortedArrays;

import java.util.Arrays;

/**
 * @author sveet
 * @date 31.01.2023
 */
public class MergeArrays {

    public static void main(String[] args) {
        int[] array1 = {1,2,3,0,0,0};
        int[] array2 = {2,5,6};
        merge(array1, 3, array2, 3);
        System.out.println(Arrays.toString(array1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index2 = 0;
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[index2];
            index2++;
        }
        Arrays.sort(nums1);
    }
}
