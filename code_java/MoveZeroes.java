package com.hss.leetcode.main;

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public void moveZeroes(int[] nums) {
        int fast = 0, slow = 0, len = nums.length;
        for(; fast < len; fast++) {
        	if(nums[fast] != 0) {
        		nums[slow] = nums[fast];
        		slow++;
        	}
        }
        for(; slow < fast; slow++) {
        	nums[slow] = 0;
        }
    }

}
