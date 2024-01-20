package Leetcode_232;

import java.util.Stack;

class MyQueue {
    Stack<Integer> stack1 = new Stack<>(); // 临时存放
    Stack<Integer> stack2 = new Stack<>(); // 数据存放

    public MyQueue() {

    }

    public void push(int x) {
        stack2.push(x);
    }

    // 1. 将数据存放的数据全部转到临时存放
    // 2. 获取临时存放的栈顶
    // 3. 将临时存放再转到数据存放
    public int pop() {
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        int x = stack1.pop();
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return x;
    }

    public int peek() {
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        int x = stack1.peek();
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return x;
    }

    public boolean empty() {
        return stack2.isEmpty();
    }
}
