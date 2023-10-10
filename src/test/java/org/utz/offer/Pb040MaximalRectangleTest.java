package org.utz.offer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pb040MaximalRectangleTest {

    @Test
    void maximalRectangle() {
        Pb040MaximalRectangle pb = new Pb040MaximalRectangle();
        int act = pb.maximalRectangle(new String[]{"10100", "10111", "11111", "10010"});
        assertEquals(6, act);
    }
}