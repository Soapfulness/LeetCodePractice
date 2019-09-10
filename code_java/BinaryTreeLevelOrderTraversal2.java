package com.hss.leetcode.main;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal2 {
	
	public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        if (null == root)
            return ans;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelNum = queue.size(); // 当前层元素的个数
            List<Integer> subList = new LinkedList<Integer>();
            for (int i = 0; i < levelNum; i++) {
                TreeNode curNode = queue.poll();
                if (null != curNode) {
                    subList.add(curNode.val);
                    queue.offer(curNode.left);
                    queue.offer(curNode.right);
                }
            }
            if (subList.size() > 0) {
                ans.add(0, subList);
            }
        }
        return ans;
    }

}
