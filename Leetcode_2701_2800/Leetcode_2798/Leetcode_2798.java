package Leetcode_2701_2800.Leetcode_2798;

class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int num = 0;
        for (int i = 0; i < hours.length; i++)
            if (hours[i] >= target)
                num++;
        return num;
    }
}