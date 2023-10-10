package org.utz.offer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Pb038DailyTemperaturesTest {

    @Test
    void dailyTemperatures() {
        Pb038DailyTemperatures pb = new Pb038DailyTemperatures();
        int[] actual = pb.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
        int[] expected = new int[]{1, 1, 4, 2, 1, 1, 0, 0};
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    void test() {
        int[] actual = new int[]{1, 2, 3};
        int[] expected = new int[]{1, 2, 3};
        assertTrue(Arrays.equals(actual, expected));
    }
}