package com.hss.leetcode.main;

public class RemoveLinkedListElements {
	
	public class ListNode {
		int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	
	public static void main(String[] args) {
		
		
	}
	
    public ListNode removeElements(ListNode head, int val) {
    	while (head != null) {
            if (head.val != val)
                break;
            head = head.next;
        }
    	if(null == head) return null;
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null) {
            if (cur.val != val) {
            	pre.next = cur;
            	pre = cur;
            }
            cur = cur.next;
        }
        pre.next = null;
        return head;
    }

}
