package Leetcode_0301_0400.Leetcode_344;

class Solution {
    public void reverseString(char[] s) {
        char tmp = ' ';
        for (int i = 0; i < s.length / 2; i++) {
            tmp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = tmp;
        }
    }
}