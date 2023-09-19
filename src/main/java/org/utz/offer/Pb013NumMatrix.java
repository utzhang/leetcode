package org.utz.offer;

public class Pb013NumMatrix {
    int[][] area;
    public Pb013NumMatrix(int[][] matrix) {
        area = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int region1 = i == 0 ? 0 : area[i - 1][j];
                int region2 = j == 0 ? 0 : area[i][j - 1];
                int region3 = i == 0 || j == 0 ? 0 : area[i - 1][j - 1];
                int region4 = matrix[i][j];
                area[i][j] = region1 + region2 - region3 + region4;
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int regionUp = row1 == 0 ? 0 : area[row1 - 1][col2];
        int regionLeft = col1 == 0 ? 0 : area[row2][col1 - 1];
        int regionLeftUp = col1 == 0 || row1 == 0 ? 0 : area[row1 - 1][col1 - 1];
        int regionAll = area[row2][col2];
        return regionAll - regionUp - regionLeft + regionLeftUp;
    }

}
