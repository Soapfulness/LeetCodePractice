package com.hss.leetcode.main;

public class RemoveDuplicatesFromSortedList {
	
	public class ListNode {
		int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}

	public static void main(String[] args) {
		
		
	}
	
    public ListNode deleteDuplicates(ListNode head) {
        ListNode head_cup = head;
        while(head_cup != null && head_cup.next != null) {
        	if(head_cup.val != head_cup.next.val) {
        		head_cup = head_cup.next;
        	}else {
        		head_cup.next = head_cup.next.next;
        	}
        }
        return head;
    }

}
