package org.utz.offer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pb010SubArraySumTest {

    @Test
    void subarraySum() {
        int[] nums = new int[]{1, 1, 1};
        Pb010SubArraySum pb = new Pb010SubArraySum();
        int count = pb.subarraySum(nums, 2);
        assertEquals(2, count);
    }
}