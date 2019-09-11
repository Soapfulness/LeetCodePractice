package com.hss.leetcode.main;

import java.util.regex.Pattern;

public class ValidPalindrome {

	public static void main(String[] args) {
		ValidPalindrome vp = new ValidPalindrome();
		String s = "A man, a plan, a canal: Panama";
		System.out.println(vp.isPalindrome(s));
	}
	
    public boolean isPalindrome(String s) {
    	Pattern p = Pattern.compile("[^0-9a-zA-Z]*");
    	String[] str = p.split(s);
    	String s_cup = "";
    	for(int i = 0; i < str.length; i++) {
    		s_cup += str[i];
    	}
    	s_cup = s_cup.toLowerCase();
        for(int i = 0, j = s_cup.length()-1; i < j; i++, j--) {
        	if(s_cup.charAt(i) != s_cup.charAt(j)) return false;
        }
        return true;
    }
    
    public boolean isPalindrome2(String s) {
    	char[] cs = s.toCharArray();
        int cnt = 0, j = 0;
        for (int i = 0; i < cs.length; i++) {
            if (('0' <= cs[i] && cs[i] <= '9') || ('a' <= cs[i] && cs[i] <= 'z')) {
                cs[cnt++] = cs[i];
            } else if ('A' <= cs[i] && cs[i] <= 'Z') {
                cs[cnt++] = (char) (cs[i] - 'A' + 'a');
            }
        }
        cnt--;
        while (j < cnt) if (cs[j++] != cs[cnt--]) return false;
        return true;
    }

}
