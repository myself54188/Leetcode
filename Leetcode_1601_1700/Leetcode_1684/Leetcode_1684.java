package Leetcode_1601_1700.Leetcode_1684;

class Solution {
    public static boolean pd(char a, String b) {
        for (int i = 0; i < b.length(); i++) {
            if (a == b.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public int countConsistentStrings(String allowed, String[] words) {
        int sum = 0;
        int a = 1;
        for (int i = 0; i < words.length; i++) {
            a = 1;
            for (int j = 0; j < words[i].length(); j++) {
                if (!pd(words[i].charAt(j), allowed)) {
                    a = -1;
                    continue;
                }
            }
            if (a == 1) {
                sum++;
            }
        }
        return sum;
    }
}