package Leetcode_2501_2600.Leetcode_2600;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numOnes; i++) {
            list.add(1);
        }
        for (int i = 0; i < numZeros; i++) {
            list.add(0);
        }
        for (int i = 0; i < numNegOnes; i++) {
            list.add(-1);
        }
        Collections.sort(list);
        int num = 0;
        for (int i = 0; i < k; i++) {
            num += list.get(list.size() - i - 1);
        }
        return num;
    }
}