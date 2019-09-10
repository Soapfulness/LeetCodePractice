package com.hss.leetcode.main;

public class SameTree {
	
	 public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public boolean isSameTree(TreeNode p, TreeNode q) {
    	if(null == p && null == q) return true;
        if(null == p || null == q) return false;
        if(p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

}
