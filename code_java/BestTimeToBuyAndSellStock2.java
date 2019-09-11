package com.hss.leetcode.main;

public class BestTimeToBuyAndSellStock2 {

	public static void main(String[] args) {
		BestTimeToBuyAndSellStock2 bttbass = new BestTimeToBuyAndSellStock2();
		int[] prices = new int[] {7,1,5,3,6,4};
		System.out.println(bttbass.maxProfit(prices));
	}
	
    public int maxProfit(int[] prices) {
    	int sum = 0;
    	for(int i = 0; i < prices.length-1; i++) {
    		if(prices[i] < prices[i+1]) sum += (prices[i+1] - prices[i]);
    	}
    	return sum;
    }

}
