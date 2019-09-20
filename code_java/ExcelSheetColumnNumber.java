package com.hss.leetcode.main;

public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		ExcelSheetColumnNumber escn = new ExcelSheetColumnNumber();
		String[] test = new String[] {"A", "Z", "AA", "ZY"};
		for(int i = 0; i < test.length; i++) {
			System.out.println(escn.titleToNumber(test[i]));
		}
	}
	
    public int titleToNumber(String s) {
        int len = s.length();
        int sum = 0;
        for(int i = 0; i < s.length(); i++) {
        	sum += ((int)s.charAt(i) - 64) * Math.pow(26, len - i - 1);
        }
        return sum;
    }

}
