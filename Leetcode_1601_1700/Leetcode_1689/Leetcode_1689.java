package Leetcode_1601_1700.Leetcode_1689;

/**
 * 只需要找到字符串中最大的字符
 */
class Solution {
    public int minPartitions(String n) {
        int max = 0;
        for (int i = 0; i < n.length(); i++) {
            max = Math.max(max, n.charAt(i) - '0');
        }
        return max;
    }
}