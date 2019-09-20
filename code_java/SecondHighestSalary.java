package com.hss.leetcode.main;

public class SecondHighestSalary {

	public static void main(String[] args) {
		//sql语句
		String sql = "SELECT\r\n" + 
				"    (SELECT DISTINCT\r\n" + 
				"            Salary\r\n" + 
				"        FROM\r\n" + 
				"            Employee\r\n" + 
				"        ORDER BY Salary DESC\r\n" + 
				"        LIMIT 1 OFFSET 1) AS SecondHighestSalary";
	}

}
