package Leetcode_1301_1400.Leetcode_1351;

class Solution {
    public int countNegatives(int[][] grid) {
        int sum = 0;
        for (int[] ints : grid) {
            for (int anInt : ints) {
                if (anInt < 0)
                    sum++;
            }
        }
        return sum;
    }
}