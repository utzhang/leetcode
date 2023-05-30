package org.utz.offer;
// Pb013
public class NumMatrix {

    private int[][] sumMatrix = null;

    public NumMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        sumMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
                if (i == 0) {
                    sumMatrix[i][j] = rowSum;
                } else {
                    sumMatrix[i][j] = rowSum + sumMatrix[i - 1][j];
                }
            }
        }
    }
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int val1 = sumMatrix[row2][col2];
        int val2 = row1 == 0 || col1 == 0 ? 0 : sumMatrix[row1 - 1][col1 - 1];
        int val3 = row1 == 0 ? 0 : sumMatrix[row1 - 1][col2];
        int val4 = col1 == 0 ? 0 : sumMatrix[row2][col1 - 1];
        return val1 + val2 - val3  -val4;
    }

    public int sumRegion2(int row1, int col1, int row2, int col2) {
        int val  = 1
                + (row1 == 0 || col1 == 0 ? 0 : 2)
                - (row1 == 0 ? 0 : 3)
                - (col1 == 0 ? 0 : 4);
        return val;
    }

}
