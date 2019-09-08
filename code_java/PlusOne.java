package com.hss.leetcode.main;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int[] plusOne(int[] digits) {
    	int i = digits.length-1;
        for(; i >= 0; i--) {
        	if(digits[i] != 9) {
        		digits[i] += 1;
        		break;
        	}else {
        		digits[i] = 0;
        	}
        }
        if(i < 0) {
        	digits = new int[digits.length + 1];
        	digits[0] = 1;
        }
        return digits;
    }

}
