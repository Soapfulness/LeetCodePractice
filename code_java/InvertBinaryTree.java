package com.hss.leetcode.main;

public class InvertBinaryTree {
	
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public TreeNode invertTree(TreeNode root) {
    	if (root == null) {
            return null;
        }
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }

}
