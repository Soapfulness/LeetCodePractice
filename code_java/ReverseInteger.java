package com.hss.leetcode.main;

public class ReverseInteger {

	public static void main(String[] args) {
		int x = 567891;
		System.out.println(reverse(x));
	}
	
	static int reverse(int x) {
        int res = 0, temp = 0;
        while(x!=0) {
        	temp = x%10;
        	x /= 10;
        	if(res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE/10 && temp > Integer.MAX_VALUE%10)) return 0;
        	if(res < Integer.MIN_VALUE/10 || (res == Integer.MIN_VALUE/10 && temp < Integer.MIN_VALUE%10)) return 0;
        	res = res*10 + temp;
        }
		return res;
    }

}
