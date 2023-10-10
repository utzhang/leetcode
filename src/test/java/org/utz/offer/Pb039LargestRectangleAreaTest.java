package org.utz.offer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pb039LargestRectangleAreaTest {

    @Test
    void largestRectangleArea() {
        Pb039LargestRectangleArea pb = new Pb039LargestRectangleArea();
        int result = pb.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3});
        assertEquals(10, result);
    }
}