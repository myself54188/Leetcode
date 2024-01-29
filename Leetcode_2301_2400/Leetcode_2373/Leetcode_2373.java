package Leetcode_2301_2400.Leetcode_2373;

import static java.lang.Math.max;

class Solution {
    public int[][] largestLocal(int[][] grid) {
        int[][] arr = new int[grid.length - 2][grid.length - 2];
        for (int i = 0; i < grid.length - 2; i++) {
            for (int j = 0; j < grid.length - 2; j++) {
                arr[i][j] = getmax(grid[i][j], grid[i][j + 1], grid[i][j + 2], grid[i + 1][j], grid[i + 1][j + 1], grid[i + 1][j + 2], grid[i + 2][j], grid[i + 2][j + 1], grid[i + 2][j + 2]);
            }
        }
        return arr;
    }

    private int getmax(int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8, int a9) {
        return max(max(max(max(a1, a2), max(a3, a4)), max(max(a5, a6), max(a7, a8))), a9);
    }
}