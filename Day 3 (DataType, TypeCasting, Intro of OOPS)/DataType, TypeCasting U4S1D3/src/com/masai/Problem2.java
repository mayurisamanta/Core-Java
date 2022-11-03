package com.masai;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factor (12);
	}
	public static void factor(int n) {
		if (n == 1 || n > 100) {
			System.out.println("Invalid number");
		}
		else {
			for (int i = 1; i <= n; i++) {
				if (n%i == 0) {
					System.out.println(i);
				}
			}
		}
	}
}
