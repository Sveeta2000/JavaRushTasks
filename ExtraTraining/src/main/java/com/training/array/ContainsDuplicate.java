package com.training.array;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int n : nums) {
            if (!seen.add(n)) {
                return true;
            }
        }
        return false;
    }
}
