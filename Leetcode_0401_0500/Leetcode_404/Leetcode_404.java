package Leetcode_0401_0500.Leetcode_404;

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
    int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        leftsum(root, false);
        return sum;
    }

    public void leftsum(TreeNode root, boolean bool) {
        // 要求是叶子结点，所以必须左右节点为空
        if (root.left == null && root.right == null && bool) {
            sum += root.val;
            return;
        }
        if (root.left != null)
            leftsum(root.left, true);
        if (root.right != null)
            leftsum(root.right, false);
    }
}