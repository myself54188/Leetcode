package Leetcode_1901_2000.Leetcode_1929;

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            arr[nums.length + i] = nums[i];
        }
        return arr;
    }
}