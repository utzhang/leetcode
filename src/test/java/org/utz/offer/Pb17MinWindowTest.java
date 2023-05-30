package org.utz.offer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pb17MinWindowTest {

    @Test
    void minWindow() {
        Pb017MinWindow pb = new Pb017MinWindow();
        assertEquals("BANC", pb.minWindow("ADOBECODEBANC", "ABC"));
        assertEquals("a", pb.minWindow("a", "a"));
        assertEquals("", pb.minWindow("a", "aa"));
    }
}