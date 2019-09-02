package com.hss.leetcode.main;

public class AddTwoNumbers {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		ListNode res = addTwoNumbers(l1, l2);
		while(res!=null) {
			System.out.println(res.val);
			res = res.next;
		}
	}
	
	static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode header = new ListNode(0);
		ListNode res = header;
		int carry = 0, s1 = 0, s2 = 0, sum = 0;
		while(l1!=null || l2!=null) {
			s1 = (l1!=null)?l1.val:0;
			s2 = (l2!=null)?l2.val:0;
			sum = carry + s1 + s2;
			carry = sum/10;
			res.next = new ListNode(sum%10);
			res = res.next;
			if(l1!=null) l1 = l1.next;
			if(l2!=null) l2 = l2.next;
		}
		if(carry == 1) {
			res.next = new ListNode(1);
		}
		return header.next;
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }