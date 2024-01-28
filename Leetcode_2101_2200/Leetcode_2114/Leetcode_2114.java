package Leetcode_2101_2200.Leetcode_2114;

class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String str : sentences) {
            max = Math.max(str.split(" ").length, max);
        }
        return max;
    }
}