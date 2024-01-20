package Leetcode_201_300.Leetcode_226;

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
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }

    // 递归求解
    public void invert(TreeNode root) {
        // 如果节点为空或者节点左右节点都为空，就返回
        if ((root == null) || (root.left == null && root.right == null)) {
            return;
        }
        //否则就进行翻转
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        //然后再依次翻转节点左右子树
        invert(root.left);
        invert(root.right);
    }
}