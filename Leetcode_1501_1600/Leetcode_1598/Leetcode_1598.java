package Leetcode_1501_1600.Leetcode_1598;

class Solution {
    public int minOperations(String[] logs) {
        int num = 0;
        for (String str : logs) {
            if (str.equals("../")) {
                if (num > 0)
                    num--;
            } else if (str.equals("./")) {
            } else num++;
        }
        return num;
    }
}
