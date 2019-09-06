package com.hss.leetcode.main;

public class ValidParentheses {

	public static void main(String[] args) {
		ValidParentheses vp = new ValidParentheses();
		String s = "[";
		System.out.println(vp.isValid(s));
	}
	
	public boolean isValid(String s) {
		int i = 0;
        while(i < s.length()) {
        	i = start(s, i);
        	if(i < 0) return false;
        }
        return true;
    }
	
	public int start(String s, int i) {
		if(i < 0 || i >= s.length()) return -1;
		switch(s.charAt(i)) {
			case ' ': return (i + 1);
			case '(': return (lr(s, ++i));
			case '[': return (ls(s, ++i));
			case '{': return (lf(s, ++i));
			default: return -1;
		}
	}
	
	public int lr(String s, int i) {
		if(i < 0 || i >= s.length()) return -1;
		switch(s.charAt(i)) {
			case ' ': return (lr(s, ++i));
			case ')': return (i + 1);
			case '(': return (lr(s, lr(s, ++i)));
			case '[': return (lr(s, ls(s, ++i)));
			case '{': return (lr(s, lf(s, ++i)));
			default: return -1;
		}
	}
	
	public int ls(String s, int i) {
		if(i < 0 || i >= s.length()) return -1;
		switch(s.charAt(i)) {
			case ' ': return (ls(s, ++i));
			case ']': return (i + 1);
			case '(': return (ls(s, lr(s, ++i)));
			case '[': return (ls(s, ls(s, ++i)));
			case '{': return (ls(s, lf(s, ++i)));
			default: return -1;
		}
	}
	
	public int lf(String s, int i) {
		if(i < 0 || i >= s.length()) return -1;
		switch(s.charAt(i)) {
			case ' ': return (lf(s, ++i));
			case '}': return (i + 1);
			case '(': return (lf(s, lr(s, ++i)));
			case '[': return (lf(s, ls(s, ++i)));
			case '{': return (lf(s, lf(s, ++i)));
			default: return -1;
		}
	}

}
