package com.hss.leetcode.main;

public class AddBinary {

	public static void main(String[] args) {
		AddBinary ab = new AddBinary();
		String a = "11", b = "1";
		System.out.println(ab.addBinary(a, b));
	}
	
    public String addBinary(String a, String b) {
        StringBuilder str = new StringBuilder();
        int ca = 0;
        for(int i = a.length()-1, j = b.length()-1; i >= 0 || j >= 0; i--, j--) {
        	int sum = ca;
        	sum += (i >= 0)?(a.charAt(i) - '0'):0;
        	sum += (j >= 0)?(b.charAt(j) - '0'):0;
        	ca = sum/2;
        	sum %= 2;
        	str.append(sum);
        }
        if(ca == 1) str.append(1);
        return str.reverse().toString();
    }

}
