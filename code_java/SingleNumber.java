	package com.hss.leetcode.main;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int singleNumber(int[] nums) {
        int res = nums[0];
        for(int i = 1; i < nums.length; i++) {
        	res ^= nums[i];
        }
        return res;
    }

}
