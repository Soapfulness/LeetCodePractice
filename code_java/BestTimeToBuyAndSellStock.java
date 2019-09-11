package com.hss.leetcode.main;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		BestTimeToBuyAndSellStock bttbass = new BestTimeToBuyAndSellStock();
		int[] prices = new int[] {7,1,5,3,6,4};
		System.out.println(bttbass.maxProfit(prices));
	}
	
    public int maxProfit(int[] prices) {
    	int min = Integer.MAX_VALUE;
    	int max = 0;
    	for(int i = 0; i < prices.length; i++) {
    		if(prices[i] < min) min = prices[i];
    		else if(prices[i] - min > max) max = prices[i] - min;
    	}
    	return max;
    }

}
