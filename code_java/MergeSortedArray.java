package com.hss.leetcode.main;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	if(m == nums1.length) return;
    	int[] nums1_cup = new int[m + n];
    	int i = 0, j = 0;
    	for(; j < n && i < m; ) {
    		if(nums1[i] < nums2[j]) {
    			nums1_cup[i + j] = nums1[i];
    			i++;
    		}else {
    			nums1_cup[i + j] = nums2[j];
    			j++;
    		}
    	}
    	for(int t = i + j; t < m + n; t++) {
    		nums1_cup[t] = (j == n)?nums1[t - j]:nums2[t - i];
    	}
    	for(int t = 0; t < m + n; t++) {
    		nums1[t] = nums1_cup[t];
    	}
    }

}
