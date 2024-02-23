package Leetcode_0301_0400.Leetcode_303;


class NumArray {
    int[] qzh;

    public NumArray(int[] nums) {
        qzh = new int[nums.length + 1];
        for (int i = 1; i < qzh.length; i++) {
            qzh[i] = qzh[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int left, int right) {

        return qzh[right + 1] - qzh[left];
    }
}