package Leetcode_0401_0500.Leetcode_515;

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


/*
    层序遍历求每层的最大值
 */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> lists = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null)
            return new ArrayList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode tmp = queue.poll();
                list.add(tmp.val);
                if (tmp.left != null)
                    queue.offer(tmp.left);
                if (tmp.right != null)
                    queue.offer(tmp.right);
            }
            int max = list.get(0);
            for (Integer in : list)
                max = Math.max(max, in);
            lists.add(max);
        }
        return lists;
    }
}