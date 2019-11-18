package com.hss.leetcode.main;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

	public static void main(String[] args) {
		WordPattern wp = new WordPattern();
		String pattern = "abba";
		String str = "cat dog dog cat";
		System.out.println(wp.wordPattern(pattern, str));
	}
	
    public boolean wordPattern(String pattern, String str) {
    	char[] patternArr = pattern.toCharArray();
    	String[] strArr = str.split(" ");
    	if(patternArr.length != strArr.length) return false;
        Map<Character, String> map = new HashMap<Character, String>();
        for(int i = 0; i < strArr.length; i++) {
        	if(map.containsKey(patternArr[i])) {
        		if(!map.get(patternArr[i]).equals(strArr[i])) {
        			return false;
        		}
        	}else if(map.containsValue(strArr[i])){
        		return false;
        	}else {
        		map.put(patternArr[i], strArr[i]);
        	}
        }
        return true;
    }

}
