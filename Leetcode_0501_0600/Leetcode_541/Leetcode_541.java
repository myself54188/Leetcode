package Leetcode_0501_0600.Leetcode_541;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String reverseStr(String s, int k) {
        String str = "";
        String b = "";
        List<String> list = new ArrayList<>();
        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            b += s.charAt(i);
            a++;
            if (a == k) {
                list.add(b);
                b = "";
                a = 0;
            }
        }
        if (!b.equals("")) {
            list.add(b);
        }

        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                str += bian(list.get(i));
            } else {
                str += list.get(i);
            }
        }
        return str;
    }

    private String bian(String s) {
        String a = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            a += s.charAt(i);
        }
        return a;
    }
}