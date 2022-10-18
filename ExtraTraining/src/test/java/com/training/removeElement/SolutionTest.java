package com.training.removeElement;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

import java.awt.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author sveet
 * @date 07.10.2022
 */
class SolutionTest {

    @Test
    void whenRemoveFiveThenNoFiveInArray() {
        int[] input = {1, 2, 3, 4, 5};
        Solution.removeElement(input, 5);
        Assertions.assertEquals(5, input.length);

        List<Integer> result = Arrays.stream(input).boxed().collect(Collectors.toList());
        Assertions.assertFalse(result.contains(5));
    }

    @Test
    void whenRemoveTenAndFourAndOneThenNoFiveInArray() {
        int[] input = {1, 2, 3, 5, 10, 4, 8, 7};
        {
            Solution.removeElement(input, 10);
            List<Integer> result = Arrays.stream(input).boxed().collect(Collectors.toList());
            Assertions.assertFalse(result.contains(10));
        }

        {
            Solution.removeElement(input, 4);
            List<Integer> result = Arrays.stream(input).boxed().collect(Collectors.toList());
            Assertions.assertFalse(result.contains(10));
            Assertions.assertFalse(result.contains(4));
        }

        {
            Solution.removeElement(input, 1);
            List<Integer> result = Arrays.stream(input).boxed().collect(Collectors.toList());
            Assertions.assertFalse(result.contains(10));
            Assertions.assertFalse(result.contains(4));
            Assertions.assertFalse(result.contains(1));
        }
    }
}
