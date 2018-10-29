package com.huilegezai.leetcode;

public class Solution100 {


    /**
     * 题意是比较两棵二叉树是否相同，那么我们就深搜比较各个节点即可。
     * @param t1
     * @param t2
     * @return
     */
    public boolean isSameTree(TreeNode t1,TreeNode t2){

        if (t1 == null && t2 == null) return true;

        if (t1 == null || t2 == null) return false;

        if (t1.val == t2.val) {

            return isSameTree(t1.left, t2.left) && isSameTree(t1.right, t2.right);

        }
        return false;
    }
}
