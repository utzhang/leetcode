package org.utz.offer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pb004SingleNumberTest {

    @Test
    void singleNumber() {
        Pb004SingleNumber pb = new Pb004SingleNumber();
        assertEquals(3, pb.singleNumber(new int[]{2, 2, 3, 2}));
        assertEquals(100, pb.singleNumber(new int[]{0, 1, 0, 1, 0, 1, 100}));
    }
}