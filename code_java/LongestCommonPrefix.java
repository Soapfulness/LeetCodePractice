package com.hss.leetcode.main;

public class LongestCommonPrefix {
	
	public static void main(String[] args) {
		String[] strs = new String[]{"comm", "com", "commc"};
		System.out.println(longestCommonPrefix(strs));
	}
	
	static String longestCommonPrefix(String[] strs) {
		if(strs.length == 0) return "";
		int len = 1;
		String comstr = "";
        while(true) {
        	if(len > strs[0].length()) return comstr;
        	comstr = strs[0].substring(0, len);
        	for(int i = 0; i < strs.length; i++) {
        		if(strs[i].indexOf(comstr) != 0) return comstr.substring(0, len-1);
        	}
        	len++;
        }
    }

}
