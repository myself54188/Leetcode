package Leetcode_225;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> queue1 = new LinkedList<>(); // 临时队列
    Queue<Integer> queue2 = new LinkedList<>(); // 数据队列

    public MyStack() {

    }

    // 1. 将代存数据放入临时队列中
    // 2. 将数据队列元素放入临时队列
    // 3. 将临时队列元素放到数据队列中

    public void push(int x) {
        queue1.offer(x);
        while (!queue2.isEmpty()) {
            queue1.offer(queue2.poll());
        }
        while (!queue1.isEmpty()) {
            queue2.offer(queue1.poll());
        }
    }

    public int pop() {
        return queue2.poll();
    }

    public int top() {
        return queue2.peek();
    }

    public boolean empty() {
        return queue2.isEmpty();
    }
}
