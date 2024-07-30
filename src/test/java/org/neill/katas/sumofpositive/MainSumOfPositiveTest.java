package org.neill.katas.sumofpositive;

import static org.junit.jupiter.api.Assertions.*;

class MainSumOfPositiveTest {

    @org.junit.jupiter.api.Test
    void testSum() {
        int[] inputArray = new int[]{20, 1, -5, -222, 1000, 0, 0, 1000};
        assertEquals(2021, MainSumOfPositive.sum(inputArray));
    }
}