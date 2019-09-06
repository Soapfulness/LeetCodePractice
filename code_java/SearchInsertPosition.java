package com.hss.leetcode.main;

public class SearchInsertPosition {

	public static void main(String[] args) {
		SearchInsertPosition sip = new SearchInsertPosition();
		int[] nums = new int[] {1,3,5,6};
		int target = 0;
		System.out.println(sip.searchInsert(nums, target));
	}
	
    public int searchInsert(int[] nums, int target) {
        if(nums.length == 0) return 0;
        int l = 0;
        for(int r = nums.length; l < r; ) {
        	int mid = (l + r) >>> 1;
        	if(nums[mid] < target) l = mid + 1;
        	else r = mid;
        }
        return l;
    }

}
