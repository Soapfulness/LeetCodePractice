package com.hss.leetcode.main;

public class LengthOfLastWord {

	public static void main(String[] args) {
		LengthOfLastWord lolw = new LengthOfLastWord();
		String s = "HelloWorld ";
		System.out.println(lolw.lengthOfLastWord(s));
	}
	
    public int lengthOfLastWord(String s) {
        if(s.length() == 0) return 0;
        int end = s.length()-1;
        while(end >= 0 && s.charAt(end) == ' ') end--;
        int i = end;
        while(i >= 0 && s.charAt(i) != ' ') i--;
        return (end - i);
    }

}
