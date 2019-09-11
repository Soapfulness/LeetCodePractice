package com.hss.leetcode.main;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	public static void main(String[] args) {
		PascalsTriangle pt = new PascalsTriangle();
		int numRows = 5;
		System.out.println(pt.generate(numRows));
	}
	
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> row = new ArrayList<List<Integer>>();
        if(0 == numRows) return row;
        row.add(new ArrayList<Integer>());
        row.get(0).add(1);
        for(int i = 1; i < numRows; i++) {
        	List<Integer> current = new ArrayList<Integer>();
        	current.add(1);
        	List<Integer> prerow = row.get(i-1);
        	for(int j = 1; j < i; j++) {
        		current.add(prerow.get(j-1) + prerow.get(j));
        	}
        	current.add(1);
        	row.add(current);
        }
        return row;
    }

}
