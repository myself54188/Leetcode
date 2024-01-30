package Leetcode_2501_2600.Leetcode_2544;

class Solution {
    public int alternateDigitSum(int n) {
        String str = n + "";
        int a = 1;
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += (str.charAt(i) - '0') * a;
            a *= -1;
        }
        return sum;
    }
}