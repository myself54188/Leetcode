package Leetcode_0901_1000.Leetcode_946;

import java.util.Stack;

/*
    模拟。用一个栈来假设入栈后遇到出栈的就出栈。看看最后栈内会不会剩下元素
 */
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int n = 0;
        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty() && stack.peek() == popped[n]) {
                stack.pop();
                n++;
            }
        }
        return stack.isEmpty();
    }
}