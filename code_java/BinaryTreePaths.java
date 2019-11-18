package com.hss.leetcode.main;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
	
	public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<String>();
        String path = "";
        traverse(root, paths, path);
        return paths;
    }
    
    public void traverse(TreeNode root, List<String> paths, String path) {
    	if (root != null) {
            path += Integer.toString(root.val);
            if ((root.left == null) && (root.right == null))  // 当前节点是叶子节点
                paths.add(path);  // 把路径加入到答案中
            else {
                path += "->";  // 当前节点不是叶子节点，继续递归遍历
                traverse(root.left, paths, path);
                traverse(root.right, paths, path);
            }
        }
    }

}
