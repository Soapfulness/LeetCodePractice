package com.hss.leetcode.main;

public class ExcelSheetColumnTitle {

	public static void main(String[] args) {
		ExcelSheetColumnTitle esct = new ExcelSheetColumnTitle();
		int[] test = new int[] {1, 26, 27, 701};
		for(int i = 0; i < test.length; i++) {
			System.out.println(esct.convertToTitle(test[i]));
		}
	}
	
    public String convertToTitle(int n) {
        StringBuilder strBuild = new StringBuilder();
        do {
        	strBuild.append((char)(64 + (n%26 == 0?26:n%26)));
        	n = n%26 == 0?n/26-1:n/26;
        }while(n > 0);
        return strBuild.reverse().toString();
    }

}
