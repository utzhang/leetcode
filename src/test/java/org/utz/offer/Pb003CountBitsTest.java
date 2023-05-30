package org.utz.offer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pb003CountBitsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void countBits() {
        Pb003CountBits pb = new Pb003CountBits();
        assertArrayEquals(new int[]{0, 1, 1}, pb.countBits(2));
    }
}