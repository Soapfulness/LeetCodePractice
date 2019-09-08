package com.hss.leetcode.main;

public class MaximumSubarray {

	public static void main(String[] args) {
		
	}
	
    public int maxSubArray(int[] nums) {
    	if(nums.length == 0) return 0;
        int res = nums[0], sum = 0;
        for(int i = 0; i < nums.length; i++) {
        	if(sum > 0) {
        		sum += nums[i];
        	}else {
        		sum = nums[i];
        	}
        	res = Math.max(res, sum);
        }
        return res;
    }

}
