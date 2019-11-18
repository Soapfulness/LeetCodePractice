package com.hss.leetcode.main;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int missingNumber(int[] nums) {
    	int len = nums.length;
    	Set<Integer> set = new HashSet<Integer>();
    	for(int i = 0; i < len; i++) {
    		set.add(nums[i]);
    	}
        for(int i = 0; i < len; i++) {
        	if(!set.contains(i)) return i;
        }
        return len;
    }

}
