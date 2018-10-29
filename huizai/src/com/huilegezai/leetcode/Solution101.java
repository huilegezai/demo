package com.huilegezai.leetcode;

public class Solution101 {


    /**
     * 题意是判断一棵二叉树是否左右对称，首先想到的是深搜，比较根结点的左右两棵子树是否对称，如果左右子树的值相同，
     * 那么再分别对左子树的左节点和右子树的右节点，左子树的右节点和右子树的左节点做比较即可。
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        return root == null || helper(root.left, root.right);
    }

    public boolean helper(TreeNode left, TreeNode right) {
        if (left == null || right == null) return left == right;
        if (left.val != right.val) return false;
        return helper(left.left, right.right) && helper(left.right, right.left);
    }
}
