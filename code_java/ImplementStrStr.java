package com.hss.leetcode.main;

public class ImplementStrStr {
	
	public static void main(String[] args) {
		ImplementStrStr is = new ImplementStrStr();
		String haystack = "hellopiggy", needle = "piggyy";
		System.out.println(is.strStr(haystack, needle));
	}
	
    public int strStr(String haystack, String needle) {
        int hl = haystack.length();
        int nl = needle.length();
        int start = 0, end = nl;
        while(end <= hl) {
        	if(needle.equals(haystack.substring(start, end))) {
        		return start;
        	}
        	start++; end++;
        }
        return -1;
    }

}
