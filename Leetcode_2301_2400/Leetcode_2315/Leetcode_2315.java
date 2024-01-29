package Leetcode_2301_2400.Leetcode_2315;

class Solution {
    public int countAsterisks(String s) {
        int num = 0;
        boolean bool = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|')
                bool = !bool;
            if (s.charAt(i) == '*' && bool)
                num++;
        }
        return num;
    }
}