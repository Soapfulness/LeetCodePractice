package com.hss.leetcode.main;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] num = {2,7,11,15};
		int[] res = twoSum(num, 22);
		for(int i = 0; i < res.length; i++)
			System.out.println(res[i]);
	}
	
	static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for(int i = 0; i < nums.length; i++) {
			int res = target - nums[i];
			if(map.containsKey(res) && map.get(res) != i) {
				return new int[] {i, map.get(res)};
			}
		}
		throw new IllegalArgumentException("No two sum solution");
    }

}
