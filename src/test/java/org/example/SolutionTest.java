package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findMaxLengthTest() {
        Solution solution = new Solution();
        assertEquals(2, solution.findMaxLength(new int[]{0, 1}));
        assertEquals(2, solution.findMaxLength(new int[]{0, 1, 0}));
    }

}