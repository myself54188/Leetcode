package Leetcode_0001_0100.Leetcode_53;

/**
 * @Author: 程浩然
 * @Create: 2024/3/13 - 21:29
 * @Description: 贪心
 */
public class Leetcode_53 {
    public int maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE;
        int tmp = 0; // 当前开始数组和
        for (int i = 0; i < nums.length; i++) {
            tmp += nums[i];
            sum = Math.max(sum, tmp);
            if (tmp < 0) {
                tmp = 0;
                continue;
            }
        }
        return sum;
    }
}
