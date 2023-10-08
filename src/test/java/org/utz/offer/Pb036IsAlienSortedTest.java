package org.utz.offer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pb036IsAlienSortedTest {

    @Test
    void isAlienSorted() {
        Pb034IsAlienSorted pb = new Pb034IsAlienSorted();
        assertTrue(pb.isAlienSorted(new String[]{"hello","leetcode"}, "hlabcdefgijkmnopqrstuvwxyz"));
        assertFalse(pb.isAlienSorted(new String[]{"word","world","row"}, "worldabcefghijkmnpqstuvxyz"));
        assertFalse(pb.isAlienSorted(new String[]{"apple","app"}, "abcdefghijklmnopqrstuvwxyz"));

    }
}