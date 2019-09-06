package com.hss.leetcode.main;

public class RemoveElement {

	public static void main(String[] args) {
		RemoveElement re = new RemoveElement();
		int[] nums = new int[] {0,1,2,2,3,0,4,2};
		int val = 2;
		System.out.println(re.removeElement(nums, val));
	}
	
	public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        int i = 0;
        for(int j = 0; j < nums.length; j++) {
        	if(nums[j] != val) {
        		nums[i++] = nums[j];
        	}
        }
        return i;
    }

}
