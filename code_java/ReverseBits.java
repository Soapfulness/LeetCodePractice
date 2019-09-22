package com.hss.leetcode.main;

public class ReverseBits {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int reverseBits(int n) {
    	int res = 0;
        for(int i = 0; i < 32; i++)
        {
            res <<= 1;
            res += n & 1;
            n >>= 1;
        }
        return res;
    }

}
