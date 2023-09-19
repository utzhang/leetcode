package org.utz.offer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pb011FindMaxLengthTest {

    @Test
    void findMaxLength() {
        int[] nums = new int[]{0, 1, 0};
        Pb011FindMaxLength pb = new Pb011FindMaxLength();
        int length = pb.findMaxLength(nums);
        assertEquals(2, length);
    }
}