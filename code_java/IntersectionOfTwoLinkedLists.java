package com.hss.leetcode.main;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoLinkedLists {
	
	class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) {
	          val = x;
	         next = null;
	     }
	 }
	
	public static void main(String[] args) {
		
		
	}
	
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	ListNode heada = headA;
    	ListNode headb = headB;
    	while(heada != headb) {
    		heada = (null == heada)?headB:heada.next;
    		headb = (null == headb)?headA:headb.next;
    	}
    	return heada;
    }

}
