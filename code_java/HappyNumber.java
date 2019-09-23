package com.hss.leetcode.main;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public boolean isHappy(int n) {
        int slow = n, fast = getSum(n);
        while(slow != fast) {
        	slow = getSum(slow);
        	fast = getSum(fast);
        	fast = getSum(fast);
        }
        return slow == 1;
    }
    
    public int getSum(int n) {
    	int sum = 0;
    	while(n > 0) {
    		sum += Math.pow(n % 10, 2);
    		n /= 10;
    	}
    	return sum;
    }

}
