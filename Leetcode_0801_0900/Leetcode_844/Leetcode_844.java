package Leetcode_0801_0900.Leetcode_844;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (!list1.isEmpty())
                    list1.remove(list1.size() - 1);
            } else {
                list1.add((int) s.charAt(i));
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (!list2.isEmpty())
                    list2.remove(list2.size() - 1);
            } else {
                list2.add((int) t.charAt(i));
            }
        }

        if (list1.size() != list2.size())
            return false;
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) != list2.get(i))
                return false;
        }
        return true;
    }
}

