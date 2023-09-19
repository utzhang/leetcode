package org.utz.offer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pb012PivotIndexTest {

    @Test
    void pivotIndex() {
        Pb012PivotIndex pb = new Pb012PivotIndex();
        int[] nums = new int[]{1, 7, 3, 6, 5, 6};
        assertEquals(3, pb.pivotIndex(nums));
    }
}