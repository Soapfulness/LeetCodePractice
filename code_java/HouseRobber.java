package com.hss.leetcode.main;

public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int rob(int[] nums) {
    	int prevMax = 0;
        int currMax = 0;
        for (int x : nums) {
            int temp = currMax;
            currMax = Math.max(prevMax + x, currMax);
            prevMax = temp;
        }
        return currMax;
    }

}
