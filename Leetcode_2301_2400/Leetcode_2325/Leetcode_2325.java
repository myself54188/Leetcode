package Leetcode_2301_2400.Leetcode_2325;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0, a = 0; i < key.length(); i++) {
            if (key.charAt(i) != ' ' && !map.containsKey(key.charAt(i))) {
                map.put(key.charAt(i), (char) ('a' + a));
                a++;
            }
        }
        String str = "";
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ')
                str += ' ';
            else
                str += map.get(message.charAt(i));
        }
        return str;
    }
}
