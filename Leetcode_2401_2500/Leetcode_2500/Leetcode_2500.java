package Leetcode_2401_2500.Leetcode_2500;

import java.util.Arrays;

class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for (int[] arr : grid) {
            Arrays.sort(arr);
        }
        int a = 0;
        for (int i = 0; i < grid[0].length; i++) {
            a += aaa(grid, i);
        }
        return a;
    }


    public int aaa(int[][] grid, int n) {
        int m = grid[0][n];
        for (int i = 0; i < grid.length; i++) {
            if (m < grid[i][n])
                m = grid[i][n];
        }
        return m;
    }
}