package com.masai;

public class Practice {

	public static void main(String[] args) {
		String result;
		
		int marks = 700;
		
		result = (marks > 500) ? "Pass" : "Fail";
		
		System.out.println(result);
		
		
		final int x = 12;
		int y;
		
//		x = 2; will give compilation error
		
		if (x == 12) {
			y = 10;
		}
		
		System.out.println(y);
	}
}
