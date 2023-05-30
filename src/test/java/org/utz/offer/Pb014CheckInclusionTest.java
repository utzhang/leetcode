package org.utz.offer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pb014CheckInclusionTest {

    @Test
    void checkInclusion() {
        Pb014CheckInclusion pb = new Pb014CheckInclusion();
        assertTrue(pb.checkInclusion("ab", "eidbaooo"));

    }
}