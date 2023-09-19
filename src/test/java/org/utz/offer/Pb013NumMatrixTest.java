package org.utz.offer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pb013NumMatrixTest {

    @Test
    void sumRegion() {
        int[][] matrix = new int[][]{
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        };
        Pb013NumMatrix pb = new Pb013NumMatrix(matrix);
        assertEquals(8, pb.sumRegion(2, 1, 4, 3));
        assertEquals(11, pb.sumRegion(1, 1, 2, 2));
        assertEquals(12, pb.sumRegion(1, 2, 2, 4));
    }
}