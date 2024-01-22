package Leetcode_0601_0700.Leetcode_682;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();
        for (String a : operations) {
            switch (a) {
                case "C" -> list.remove(list.size() - 1);
                case "D" -> list.add(list.get(list.size() - 1) * 2);
                case "+" -> list.add(list.get(list.size() - 1) + list.get(list.size() - 2));
                default -> list.add(Integer.parseInt(a));
            }
        }
        int sum = 0;
        for (Integer in : list) {
            sum += in;
        }
        return sum;
    }
}