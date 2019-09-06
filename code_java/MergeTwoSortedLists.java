package com.hss.leetcode.main;

public class MergeTwoSortedLists {

	 public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }

	public static void main(String[] args) {
		
	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(null == l1) {
        	return l2;
        }else if(null == l2) {
        	return l1;
        }else if(l1.val < l2.val) {
        	l1.next = mergeTwoLists(l1.next, l2);
        	return l1;
        }else {
        	l2.next = mergeTwoLists(l1, l2.next);
        	return l2;
        }
    }

}
