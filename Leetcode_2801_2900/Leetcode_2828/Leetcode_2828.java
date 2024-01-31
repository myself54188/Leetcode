package Leetcode_2801_2900.Leetcode_2828;

import java.util.List;

class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String str = "";
        for (String sss : words) {
            str += sss.charAt(0);
        }
        return str.equals(s);
    }
}