package Leetcode_1201_1300.Leetcode_1221;

class Solution {
    public int balancedStringSplit(String s) {
        int a = 0; // R 的数量
        int n = 0; // 对数
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R')
                a++;
            if (s.charAt(i) == 'L')
                a--;
            if (a == 0) // 说明RL平衡了
                n++;
        }
        return n;
    }
}