package org.utz.offer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Pb001DivideTest {

    @Test
    public void divide() {
        assertEquals(7, new Pb001Divide().divide(15, 2));
        assertEquals(-2, new Pb001Divide().divide(7, -3));
        assertEquals(0, new Pb001Divide().divide(0, 1));
        assertEquals(1, new Pb001Divide().divide(1, 1));
    }
}