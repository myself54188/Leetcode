package Leetcode_2701_2800.Leetcode_2788;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> arr = new ArrayList<>();
        for (String a : words) {
            String b = "";
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == separator) {
                    if (!b.equals(""))
                        arr.add(b);
                    b = "";
                } else {
                    b += a.charAt(i);
                }
            }
            if (!b.equals(""))
                arr.add(b);
        }
        return arr;
    }
}