package com.hss.leetcode.main;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        int i = 0;
        for(; i < s.length(); i++) {
        	if(map.containsKey(s.charAt(i)) && ((char)map.get(s.charAt(i)) != t.charAt(i)))
        		break;
        	else if(map.containsValue(t.charAt(i)) && !map.containsKey(s.charAt(i)))
        		break;
        	map.put(s.charAt(i), t.charAt(i));
        }
        return i == s.length();
    }

}
