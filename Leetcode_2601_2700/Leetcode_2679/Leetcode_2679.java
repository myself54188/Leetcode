package Leetcode_2601_2700.Leetcode_2679;

import java.util.Arrays;

class Solution {
    public int matrixSum(int[][] nums) {
        for (int[] arr : nums)
            Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < nums[0].length; i++) {
            int max = nums[0][i];
            for (int j = 0; j < nums.length; j++) {
                max = Math.max(max, nums[j][i]);
            }
            sum += max;
        }
        return sum;
    }
}