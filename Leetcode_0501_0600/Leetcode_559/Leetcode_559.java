package Leetcode_0501_0600.Leetcode_559;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

class Solution {
    public int maxDepth(Node root) {
        Queue<Node> queue = new LinkedList<>();
        if (root == null)
            return 0;
        queue.offer(root);
        int ceng = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                for (Node tmp : node.children) {
                    queue.offer(tmp);
                }
            }
            ceng++;
        }
        return ceng;
    }
}