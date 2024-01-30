package Leetcode_2701_2800.Leetcode_2744;

import java.util.HashSet;

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        // 一次遍历，构造哈希集合
        HashSet<String> wordSet = new HashSet<>();
        for (String word : words) {
            wordSet.add(word);
        }

        // 二次遍历：匹配查找
        int rs = 0;
        for (String word : words) {
            String reverseWord = new StringBuilder(word).reverse().toString();
            if (reverseWord.equals(word)) {
                // 跳过回文，例：zz
                continue;
            }
            if (wordSet.contains(reverseWord)) {
                rs++;
                wordSet.remove(word);
                wordSet.remove(reverseWord);
            }
        }
        return rs;
    }
}