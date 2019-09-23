package com.hss.leetcode.main;

import java.util.BitSet;

public class CountPrimes {

	public static void main(String[] args) {
		CountPrimes cp = new CountPrimes();
		int n = 64;
		System.out.println(cp.countPrimes(n));
	}
	
    public int countPrimes(int n) {
    	if(n < 2) return 0;
    	int count = 0;
        BitSet bst = new BitSet(n-1);
        bst.set(0);
        for(int i = 2; i < n; i++) {
        	if(!bst.get(i-1)) {
        		count++;
        		for(int j = i * 2; j < n; j += i) {
        			bst.set(j-1);
        		}
        	}
        }
        return count;
    }

}
