package Leetcode_2701_2800.Leetcode_2778;

class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (n % (i + 1) == 0)
                sum += (int) Math.pow(nums[i], 2);
        }
        return sum;
    }
}