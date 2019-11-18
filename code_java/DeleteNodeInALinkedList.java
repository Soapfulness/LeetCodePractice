package com.hss.leetcode.main;

public class DeleteNodeInALinkedList {
	
	class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) {
	          val = x;
	         next = null;
	     }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
