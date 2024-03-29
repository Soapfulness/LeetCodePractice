package com.hss.leetcode.main;

public class SqrtX {

	public static void main(String[] args) {
		SqrtX sq = new SqrtX();
		int x = 255;
		System.out.println(sq.mySqrt(x));
	}
	
    public int mySqrt(int x) {
        if(x == 0) return 0;
        long left = 1, right = x/2;
        while(left < right) {
        	long mid = (left + right + 1) >>> 1;
        	long square = mid * mid;
        	if(square > x) right = mid - 1;
        	else left = mid;
        }
        return (int)left;
    }

}
