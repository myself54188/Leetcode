package Leetcode_0701_0800.Leetcode_704;

class Solution {
    public int search(int[] nums, int target) {
        int a = 0;
        int b = nums.length - 1;
        int c = 0;
        while (a <= b) {
            c = (a + b) / 2;
            if (nums[c] > target) {
                b = c - 1;
            } else if (nums[c] < target) {
                a = c + 1;
            } else {
                return c;
            }
        }
        return -1;
    }
}