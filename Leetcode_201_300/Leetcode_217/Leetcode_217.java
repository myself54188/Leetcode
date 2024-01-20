package Leetcode_201_300.Leetcode_217;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            if (map.containsKey(x)) {
                return true;
            } else {
                map.put(x, 1);
            }
        }
        return false;
    }
}