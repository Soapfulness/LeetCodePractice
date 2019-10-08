package com.hss.leetcode.main;

public class ReverseLinkedList {
	
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
	
    public ListNode reverseList(ListNode head) {
    	/*
    	 * 递归法
    	 */
//    	if (head == null || head.next == null) return head;
//        ListNode p = reverseList(head.next);
//        head.next.next = head;
//        head.next = null;
//        return p;
        
        /*
                       * 迭代法
         */
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

}
