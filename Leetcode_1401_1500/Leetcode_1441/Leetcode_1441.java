package Leetcode_1401_1500.Leetcode_1441;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int a = 0;
        for (int i = 1; i <= n; i++) {
            if (a == target.length)
                break;
            if (target[a] == i) {
                list.add("Push");
                a++;
            } else {
                list.add("Push");
                list.add("Pop");
            }
        }
        return list;
    }
}