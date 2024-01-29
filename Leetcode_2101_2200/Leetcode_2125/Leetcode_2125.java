package Leetcode_2101_2200.Leetcode_2125;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int numberOfBeams(String[] bank) {
        List<Integer> list = new ArrayList<>();
        for (String str : bank) {
            int num = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '1')
                    num++;
            }
            if (num != 0)
                list.add(num);
        }
        int sum = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            sum += list.get(i) * list.get(i + 1);
        }
        return sum;
    }
}