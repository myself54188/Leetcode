package Leetcode_201_300.Leetcode_209;

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int p = 0; // 起始位置
        int q = 0; // 终止位置
        int num = 0; // 记录相加大小
        int sum = Integer.MAX_VALUE; // 记录个数，先赋值最大，然后找最小。如果赋值为0，最小找到就是0

        for (; q < nums.length; q++) { // 终止位置不断前移
            num += nums[q]; // num加上q前移的指向的值

            while (num >= target) { // p前移，前移的同时num还要减去退出窗口的值，sum记录的大小也要取小的哪个值
                sum = sum > (q - p + 1) ? (q - p + 1) : sum;
                num -= nums[p++];
            }
        }

        return sum == Integer.MAX_VALUE ? 0 : sum; // 如果最后全加一起也不大于target，那么sum还是等于Integer.MAX_VALUE，这时候就返回0
    }
}