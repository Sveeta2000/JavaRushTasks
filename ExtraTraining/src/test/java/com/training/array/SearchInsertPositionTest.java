package com.training.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchInsertPositionTest {

    @Test
    public void whenNums1andTarget2ThenPos1() {
        int[] nums = {1};
        int target = 2;
        Assertions.assertEquals(1, SearchInsertPosition.searchInsert(nums, target));
    }

    @Test
    public void whenNums1356andTarget7ThenPos4() {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        Assertions.assertEquals(4, SearchInsertPosition.searchInsert(nums, target));
    }

    @Test
    public void whenNums1356andTarget2ThenPos1() {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        Assertions.assertEquals(1, SearchInsertPosition.searchInsert(nums, target));
    }

    @Test
    public void whenNums1356andTarget5ThenPos2() {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        Assertions.assertEquals(2, SearchInsertPosition.searchInsert(nums, target));
    }

    @Test
    public void whenNums13andTarget0ThenPos0() {
        int[] nums = {1, 3};
        int target = 0;
        Assertions.assertEquals(0, SearchInsertPosition.searchInsert(nums, target));
    }

    @Test
    public void whenNums13andTarget2ThenPos1() {
        int[] nums = {1, 3};
        int target = 2;
        Assertions.assertEquals(1, SearchInsertPosition.searchInsert(nums, target));
    }

    @Test
    public void whenNums357910andTarget8ThenPos3() {
        int[] nums = {3, 5, 7, 9, 10};
        int target = 8;
        Assertions.assertEquals(3, SearchInsertPosition.searchInsert(nums, target));
    }
}
