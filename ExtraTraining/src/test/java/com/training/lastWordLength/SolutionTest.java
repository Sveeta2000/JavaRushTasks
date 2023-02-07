package com.training.lastWordLength;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author sveet
 * @date 07.02.2023
 */
class SolutionTest {

    @Test
    void whenStringThen6() {
        String input = "what if so   string  ";
        int expected = 6;
        int out = Solution.lengthOfLastWord(input);
        Assertions.assertEquals(expected, out);
    }
}