package com.hss.leetcode.main;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {

	public static void main(String[] args) {
		PascalsTriangle2 pt = new PascalsTriangle2();
		int numRows = 5;
		System.out.println(pt.getRow(numRows));
	}
	
    public List<Integer> getRow(int rowIndex) {
        List<Integer> current = new ArrayList<Integer>();
        current.add(1);
        for(int i = 1; i <= rowIndex; i++) {
        	for(int j = i - 1; j > 0; j--) {
        		current.set(j, current.get(j) + current.get(j-1));
        	}
        	current.add(1);
        }
        return current;
    }

}
