package org.utz.offer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pb089RobTest {

    @Test
    void rob() {
        Pb089Rob pb = new Pb089Rob();
        assertEquals(4, pb.rob(new int[]{1,2,3,1}));
        assertEquals(12, pb.rob(new int[]{2, 7, 9, 3, 1}));
    }
}