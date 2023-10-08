package org.utz.offer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Pb035FindMinDifferenceTest {

    @Test
    void findMinDifference() {
        Pb035FindMinDifference pb = new Pb035FindMinDifference();
        assertEquals(1, pb.findMinDifference(Arrays.asList("23:59", "00:00")));
        assertEquals(0, pb.findMinDifference(Arrays.asList("00:00","23:59","00:00")));

    }
}