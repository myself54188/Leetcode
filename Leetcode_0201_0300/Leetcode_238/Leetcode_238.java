package Leetcode_0201_0300.Leetcode_238;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int[] qzzj = new int[nums.length];
        int[] hzzj = new int[nums.length];
        qzzj[0] = 1;
        hzzj[hzzj.length - 1] = 1;

        for (int i = 1; i < nums.length; i++)
            qzzj[i] = qzzj[i - 1] * nums[i - 1];
        for (int i = nums.length - 2; i >= 0; i--)
            hzzj[i] = hzzj[i + 1] * nums[i + 1];
        for (int i = 0; i < answer.length; i++)
            answer[i] = qzzj[i] * hzzj[i];
        return answer;
    }
}
