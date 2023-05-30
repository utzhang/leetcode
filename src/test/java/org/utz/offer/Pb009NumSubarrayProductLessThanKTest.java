package org.utz.offer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pb009NumSubarrayProductLessThanKTest {

    @Test
    void numSubarrayProductLessThanK() {
        Pb009NumSubarrayProductLessThanK pb = new Pb009NumSubarrayProductLessThanK();
        assertEquals(8, pb.numSubarrayProductLessThanK(new int[]{10, 5, 2, 6}, 100));
    }
}