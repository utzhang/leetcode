package org.utz.offer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pb088MinCostClimbingStairsTest {

    @Test
    void minCostClimbingStairs() {
        Pb088MinCostClimbingStairs pb = new Pb088MinCostClimbingStairs();
        assertEquals(15, pb.minCostClimbingStairs(new int[]{10, 15, 20}));
        assertEquals(6, pb.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
}