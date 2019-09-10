package com.hss.leetcode.main;

public class SymmetricTree {
	
	public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isSymmetric(TreeNode root) {
        if(null == root) return true;
        return isMirror(root.left, root.right);
    }
	
	public boolean isMirror(TreeNode left, TreeNode right) {
		if(null == left && null == right) return true;
        if(null == left || null == right) return false;
        if(left.val != right.val) return false;
        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
	}

}
