package org.utz.offer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pb008MinSubArrayLenTest {

    @Test
    void minSubArrayLen() {
        Pb008MinSubArrayLen pb = new Pb008MinSubArrayLen();
        assertEquals(2, pb.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    }
}