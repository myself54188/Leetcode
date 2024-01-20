package Leetcode_0301_0400.Leetcode_383;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        int[] brr = new int[26];
        for (int i = 0; i < ransomNote.length(); i++) {
            arr[ransomNote.charAt(i) - 'a']++;
        }
        for (int i = 0; i < magazine.length(); i++) {
            brr[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] - brr[i] > 0) {
                return false;
            }
        }
        return true;
    }
}