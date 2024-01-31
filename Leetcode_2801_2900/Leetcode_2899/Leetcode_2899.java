package Leetcode_2801_2900.Leetcode_2899;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> lastVisitedIntegers(List<String> words) {
        List<Integer> num = new ArrayList<>();
        List<Integer> aaa = new ArrayList<>();
        int sum = 0;
        for (String i : words) {
            if (i.equals("prev")) {
                sum++;
                try {
                    aaa.add(num.get(num.size() - (sum - 1) - 1));
                } catch (Exception a) {
                    aaa.add(-1);
                }
            } else {
                sum = 0;
                num.add(Integer.parseInt(i));
            }
        }
        return aaa;
    }
}