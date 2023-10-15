package org.utz.offer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pb057ContainsNearbyAlmostDuplicateTest {

    @Test
    void containsNearbyAlmostDuplicate() {
        Pb057ContainsNearbyAlmostDuplicate pb = new Pb057ContainsNearbyAlmostDuplicate();
        boolean b = pb.containsNearbyAlmostDuplicate(new int[]{-1, 2, 10, 100}, 3, 2);
        assertFalse(b);
    }
}