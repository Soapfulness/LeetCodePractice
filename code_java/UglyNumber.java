package com.hss.leetcode.main;

public class UglyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public boolean isUgly(int num) {
        while(num != 1) {
        	int temp = num;
        	if(num % 2 == 0) num /= 2;
        	if(num % 3 == 0) num /= 3;
        	if(num % 5 == 0) num /= 5;
        	if(num == temp) return false;
        }
        return true;
    }

}
