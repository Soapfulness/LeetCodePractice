package com.hss.leetcode.main;

public class PalindromeNumber {

	public static void main(String[] args) {
		int x = 1331;
		int y = 131;
		int z = 1231;
		System.out.println(isPalindrome(x));
		System.out.println(isPalindrome(y));
		System.out.println(isPalindrome(z));
	}
	
	static boolean isPalindrome(int x) {
        if(x < 0 || (x%10==0 && x!=0)) return false;
        int pn = 0, temp = 0;
        while(pn < x) {
        	temp = x % 10;
        	x /= 10;
        	pn = pn*10 + temp;
        }
        if(x < pn && x != pn/10) return false;
		return true;
    }

}
