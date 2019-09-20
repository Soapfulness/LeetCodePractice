package com.hss.leetcode.main;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int majorityElement(int[] nums) {
        int zone = nums.length/2;
        while(true) {
	        int i = (int)(Math.random()*nums.length);
	        if(count(nums, nums[i]) > zone) {
	        	return nums[i];
	        }
        }
    }
    
    public int count(int[] nums, int num) {
    	int count = 0;
    	for(int i = 0; i < nums.length; i++) {
    		if(nums[i] == num) count++;
    	}
    	return count;
    }

}
