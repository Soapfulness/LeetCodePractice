package com.hss.leetcode.main;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {
		String s = "IXL";
		System.out.println(romanToInt(s));
	}
	
	static int romanToInt(String s) {
		int res = 0;
        for(int i = 0; i < s.length(); i++) {
        	switch(s.charAt(i)) {
        		case 'I': res += 1; break;
        		case 'V': res += 5; break;
        		case 'X': res += 10; break;
        		case 'L': res += 50; break;
        		case 'C': res += 100; break;
        		case 'D': res += 500; break;
        		case 'M': res += 1000; break;
        	}
        }
        for(int i = 0; i < s.length()-1; i++) {
        	String str = s.substring(i, i+2);
        	switch(str) {
        		case "IV":
        		case "IX": res -= 2; break;
        		case "XL":
        		case "XC": res -= 20; break;
        		case "CD":
        		case "CM": res -= 200; break;
        	}
        }
		return res;
    }
	
	static int romanToInt2(String s) {
		int res = 0;
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		for(int i = 0, offset = 0; i < s.length(); i += offset+1, offset = 0) {
			while(i+offset+1 < s.length() && map.get(s.charAt(i+offset)) < map.get(s.charAt(i+offset+1))) {
				offset++;
			}
			res += map.get(s.charAt(i+offset));
			for(int j = i+offset-1; j >= i; j--) {
				res -= map.get(s.charAt(j));
			}
		}
		return res;
	}

}
