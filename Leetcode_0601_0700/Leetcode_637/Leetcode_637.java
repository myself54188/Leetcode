package Leetcode_0601_0700.Leetcode_637;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> lists = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList();
        if (root == null)
            return new ArrayList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            double num = 0;
            for (int i = 0; i < size; i++) {
                TreeNode tmp = queue.poll();
                num += tmp.val;
                if (tmp.left != null)
                    queue.offer(tmp.left);
                if (tmp.right != null)
                    queue.offer(tmp.right);
            }
            lists.add(num / size);
        }
        return lists;
    }
}