package Leetcode_0301_0400.Leetcode_304;

/**
 * 二维数组前缀和
 */
class NumMatrix {
    int[][] qzh;

    public NumMatrix(int[][] matrix) {
        qzh = new int[matrix.length + 1][matrix[0].length + 1];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                qzh[i + 1][j + 1] = qzh[i + 1][j] + qzh[i][j + 1] - qzh[i][j] + matrix[i][j];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return qzh[row2 + 1][col2 + 1] - qzh[row2 + 1][col1] - qzh[row1][col2 + 1] + qzh[row1][col1];
    }
}