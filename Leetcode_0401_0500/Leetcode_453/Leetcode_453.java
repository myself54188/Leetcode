package Leetcode_0401_0500.Leetcode_453;


/**
 * 每次让n-1个数增加1，可以等效为让1个数减1
 */
class Solution {
    public int minMoves(int[] nums) {
        //求出最小值
        int min = nums[0];
        for (int j : nums) {
            min = Math.min(min, j);
        }
        // 让非最小值每次减一，求解次数sum
        int sum = 0;
        for (int num : nums) {
            sum += num - min;
        }
        return sum;
    }
}