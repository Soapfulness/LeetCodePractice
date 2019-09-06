package com.hss.leetcode.main;

import java.util.ArrayList;
import java.util.List;

public class CountAndSay {

	public static void main(String[] args) {
		CountAndSay cas = new CountAndSay();
		int n = 5;
		System.out.println(cas.countAndSay(n));
	}
	
    public String countAndSay(int n) {
    	if(n <= 0) return "";
        String str = "1";
        for(int i = 1; i < n; i++) {
        	str = cas(str);
        }
        return str;
    }
    
    public String cas(String str) {
    	List<Integer> amount = new ArrayList<>();
        List<Integer> number = new ArrayList<>();
        number.add(Integer.parseInt(str.charAt(0) + ""));
        if(str.length() == 1) amount.add(1);
        for(int i = 1, count = 1; i < str.length(); i++) {
        	if(str.charAt(i) == str.charAt(i-1)) {
        		count++;
        		if(i == str.length()-1) {
            		amount.add(count);
            	}
        	}else {
        		number.add(Integer.parseInt(str.charAt(i) + ""));
        		amount.add(count);
        		count = 1;
        		if(i == str.length()-1) {
            		amount.add(count);
            	}
        	}
        }
        String res = "";
        for(int i = 0; i < amount.size(); i++) {
        	res += amount.get(i).toString() + number.get(i).toString();
        }
        return res;
    }

}
