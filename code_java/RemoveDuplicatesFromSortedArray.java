package com.hss.leetcode.main;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		RemoveDuplicatesFromSortedArray rdfsa = new RemoveDuplicatesFromSortedArray();
		int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
		System.out.println(rdfsa.removeDuplicates(nums));
	}
	
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int i = 1;
        for(int j = 1; j < nums.length; j++) {
        	if(nums[i-1] != nums[j]) {
        		nums[i++] = nums[j];
        	}
        }
        return i;
    }

}
