package Leetcode_0301_0400.Leetcode_367;

class Solution {
    public boolean isPerfectSquare(int num) {
        int a = (int) Math.sqrt(num);
        return a * a - num == 0;
    }
}