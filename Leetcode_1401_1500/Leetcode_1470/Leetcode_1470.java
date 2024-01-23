package Leetcode_1401_1500.Leetcode_1470;

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        for (int i = 0, a = 0; i < n; i++, a += 2) {
            arr[a] = nums[i];
            arr[a + 1] = nums[n + i];
        }
        return arr;
    }
}