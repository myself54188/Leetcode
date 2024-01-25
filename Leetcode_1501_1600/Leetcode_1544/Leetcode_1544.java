package Leetcode_1501_1600.Leetcode_1544;

import java.util.Stack;

class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty()) {
                char ch = stack.peek();
                if (Math.abs(ch - s.charAt(i)) == ('a' - 'A'))
                    stack.pop();
                else
                    stack.push(s.charAt(i));
            } else {
                stack.push(s.charAt(i));
            }
        }
        StringBuilder str = new StringBuilder();
        while (!stack.isEmpty())
            str.append(stack.pop());
        return str.reverse().toString();
    }
}