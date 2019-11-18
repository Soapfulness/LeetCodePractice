package com.hss.leetcode.main;

public class ValidAnagram {

	public static void main(String[] args) {
		ValidAnagram va = new ValidAnagram();
		String s = "aacc", t = "ccac";
		System.out.println(va.isAnagram(s, t));
	}
	
    public boolean isAnagram(String s, String t) {
    	if(s.length() != t.length()) return false;
    	int i = 0, len = s.length();
        for(; i < len; i++) {
        	int temp = -1;
        	if((temp = t.indexOf(s.charAt(i))) != -1) {
        		t = t.substring(0, temp) + t.substring(temp + 1, t.length());
        		System.out.println(i + "轮:" + t);
        	}else {
        		break;
        	}
        }
        return i == len ? true : false;
    }

}
