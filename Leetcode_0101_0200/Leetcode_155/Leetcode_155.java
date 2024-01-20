package Leetcode_0101_0200.Leetcode_155;

class MinStack {
    int[] arr = new int[100000];
    int top = -1;
    int min = Integer.MAX_VALUE;

    public MinStack() {
    }

    public void push(int val) {
        arr[++top] = val;
    }

    public void pop() {
        top--;
    }

    public int top() {
        return arr[top];
    }

    public int getMin() {
        min = Integer.MAX_VALUE;
        for (int i = 0; i <= top; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }
}