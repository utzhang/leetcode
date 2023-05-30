package org.utz.offer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumMatrixTest {

    @Test
    void sumRegion() {
        int[][] matrix = new int[][]{
                new int[]{3, 0, 1, 4, 2},
                new int[]{5, 6, 3, 2, 1},
                new int[]{1, 2, 0, 1, 5},
                new int[]{4, 1, 0, 1, 7},
                new int[]{1, 0, 3, 0, 5},
        };
        NumMatrix numMatrix = new NumMatrix(matrix);
        int sum = numMatrix.sumRegion(2, 1, 4, 3);
        System.out.println(sum);
        int sum2 = numMatrix.sumRegion2(2, 1, 4, 3);
        System.out.println(sum2);
    }
}