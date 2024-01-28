package Leetcode_2001_2100.Leetcode_2006;

class Solution {
    public int countKDifference(int[] nums, int k) {
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k)
                    num++;
            }
        }
        return num;
    }
}