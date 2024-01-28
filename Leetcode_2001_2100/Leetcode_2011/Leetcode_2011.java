package Leetcode_2001_2100.Leetcode_2011;

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int num = 0;
        for (String str : operations) {
            char ch = str.charAt(1);
            if (ch == '+')
                num++;
            if (ch == '-')
                num--;
        }
        return num;
    }
}