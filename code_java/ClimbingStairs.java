package com.hss.leetcode.main;

public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int climbStairs(int n) {
    	if(n == 1) return 1;
    	if(n == 2) return 2;
    	int a = 1, b = 2, c = 3;
    	for(int i = 3; i <= n; i++) {
    		c = a + b;
    		a = b;
    		b = c;
    	}
    	return c;
    }

}
