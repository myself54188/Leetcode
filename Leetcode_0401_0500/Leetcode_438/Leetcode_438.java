package Leetcode_0401_0500.Leetcode_438;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= s.length() - p.length(); i++) {
            String str = s.substring(i, i + p.length());
            if (is(str, p)) {
                list.add(i);
            }
        }
        return list;
    }

    private boolean is(String str, String p) {
        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < p.length(); i++) {
            arr[p.charAt(i) - 'a']--;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
