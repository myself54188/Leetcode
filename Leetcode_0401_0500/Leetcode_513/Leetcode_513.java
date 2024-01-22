package Leetcode_0401_0500.Leetcode_513;

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
    public int findBottomLeftValue(TreeNode root) {
        List<Integer> list = null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode tmp = queue.poll();
                list.add(tmp.val);
                if (tmp.left != null)
                    queue.offer(tmp.left);
                if (tmp.right != null)
                    queue.offer(tmp.right);
            }
        }
        return list.get(0);
    }
}
