package Leetcode_201_300.Leetcode_222;

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
    int num;

    public int countNodes(TreeNode root) {
        countNodes1(root);
        return num;
    }

    public void countNodes1(TreeNode root) {
        if (root == null)
            return;
        num++;
        countNodes1(root.left);
        countNodes1(root.right);

    }
}