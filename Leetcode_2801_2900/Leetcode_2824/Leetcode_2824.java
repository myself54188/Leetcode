package Leetcode_2801_2900.Leetcode_2824;

import java.util.List;

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target)
                    sum++;
            }
        }
        return sum;
    }
}