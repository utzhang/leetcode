package org.utz.offer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pb006TwoSumTest {

    @Test
    void twoSum() {
        Pb006TwoSum pb = new Pb006TwoSum();
        int[] res = pb.twoSum(new int[]{1, 2, 4, 6, 10}, 8);
        assertArrayEquals(new int[]{1, 2}, res);
    }
}