package Leetcode_1701_1800.Leetcode_1773;

import java.util.List;

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int num = 0;
        for (List<String> list : items) {
            switch (ruleKey) {
                case "type":
                    if (list.get(0).equals(ruleValue))
                        num++;
                    break;
                case "color":
                    if (list.get(1).equals(ruleValue))
                        num++;
                    break;
                case "name":
                    if (list.get(2).equals(ruleValue))
                        num++;
                    break;

            }
        }
        return num;
    }
}