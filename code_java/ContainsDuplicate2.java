	package com.hss.leetcode.main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate2 {

	public static void main(String[] args) {
		ContainsDuplicate2 cd = new ContainsDuplicate2();
		int[] test = new int[] {1, 2, 3, 4, 3};
		int k = 2;
		System.out.println(cd.containsNearbyDuplicate(test, k));
	}
	
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    	/*
         * Time Limit Exceeded
         */
//    	if(k >= nums.length) return containsDuplicate(nums);
//        for(int i = 0; i < nums.length - k; i++) {
//        	int[] temp = Arrays.copyOfRange(nums, i, i + k + 1);
//        	if(containsDuplicate(temp)) {
//        		return true;
//        	}
//        }
//        return false;
    	
    	Set<Integer> set = new HashSet<>();
    	for(int i = 0; i < nums.length; i++) {
    		if(set.contains(nums[i])) {
        		return true;
        	}else {
        		set.add(nums[i]);
        	}
    		if(set.size() > k) {
    			set.remove(nums[i - k]);
    		}
    	}
    	return false;
    }
    
    /*
     * Time Limit Exceeded
     */
//    public boolean containsDuplicate(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//        for(int i= 0; i < nums.length; i++) {
//        	if(set.contains(nums[i])) {
//        		return true;
//        	}else {
//        		set.add(nums[i]);
//        	}
//        }
//        return false;
//    }

}
