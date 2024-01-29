package Leetcode_2301_2400.Leetcode_2351;

class Solution {
    public char repeatedCharacter(String s) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] != 0)
                return s.charAt(i);
            else
                arr[s.charAt(i) - 'a']++;
        }
        return ' ';
    }
}