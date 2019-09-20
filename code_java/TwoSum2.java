package com.hss.leetcode.main;

public class TwoSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length-1;
        while(i < j) {
        	int sum = numbers[i] + numbers[j];
        	if(target == sum) break;
        	else if(target < sum) j--;
        	else i++;
        }
        return new int[] {i+1, j+1};
    }

}
