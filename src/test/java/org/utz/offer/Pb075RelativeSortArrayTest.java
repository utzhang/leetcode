package org.utz.offer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pb075RelativeSortArrayTest {

    @Test
    void relativeSortArray() {
        Pb075RelativeSortArray pb = new Pb075RelativeSortArray();
        int[] arr1 = new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = new int[]{2,1,4,3,9,6};
        int[] res = pb.relativeSortArray(arr1, arr2);
        int[] expect = new int[]{2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19};
        assertNotNull(res);
        assertEquals(expect.length, res.length);
        for (int i = 0; i < expect.length; i++) {
            assertEquals(expect[i], res[i]);
        }
    }
}