package Leetcode_283;

class Solution {
    public void moveZeroes(int[] nums) {
        int a = 0; // 快指针
        int b = 0; // 慢指针
        for (; a < nums.length; a++) {
            // 当快指针指向非零时，就把非零赋值给b，b再向后走
            if (nums[a] != 0) {
                nums[b] = nums[a];
                b++;
            }
        }
        // 将b后面的都赋值为0
        for (; b < nums.length; b++) {
            nums[b] = 0;
        }
    }
}