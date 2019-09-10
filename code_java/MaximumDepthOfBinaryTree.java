package com.hss.leetcode.main;

public class MaximumDepthOfBinaryTree {
	
	public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int maxDepth(TreeNode root) {
        if(null == root) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

}
