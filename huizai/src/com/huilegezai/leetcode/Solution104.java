package com.huilegezai.leetcode;

public class Solution104 {


    /**
     * 题意是找到二叉树的最大深度，很明显，深搜即可，每深入一次节点加一即可，然后取左右子树的最大深度。
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
