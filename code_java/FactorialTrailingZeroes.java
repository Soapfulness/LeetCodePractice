package com.hss.leetcode.main;

public class FactorialTrailingZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int trailingZeroes(int n) {
    	return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }

}
