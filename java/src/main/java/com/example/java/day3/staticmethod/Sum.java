package com.example.java.day3.staticmethod;

public class Sum {

	public static void main(String[] args) {
		sum (5); // By calling the method sum
		Sum.sum(9); // By calling the method sum using class name
		Sum p = new Sum();
		p.sum(10); // By creating object of class and calling the method sum
	}
	public static void sum(int n) {
		System.out.println("Sum of first " + n + " natural numbers is: ");
		System.out.println((n * (n + 1) / 2));
	}

}
