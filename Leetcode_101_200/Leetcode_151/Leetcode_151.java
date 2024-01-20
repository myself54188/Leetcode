package Leetcode_101_200.Leetcode_151;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        List<String> arr = Arrays.asList(s.split("\\s+"));
        Collections.reverse(arr);
        return String.join(" ", arr);
    }
}