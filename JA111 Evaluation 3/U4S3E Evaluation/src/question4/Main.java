package question4;

import java.util.Scanner;

public class Main {
	static void printchar(String s ,int i) {
		if (i < 0 || i >= s.length()) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Invalid position, Please enter a valid position");
			int p = sc.nextInt();
			
			printchar(s, p);
			
			sc.close();
			
		}
		else {
			System.out.println(s.charAt(i));
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String str = sc.next();
		
		System.out.println("Enter a position");
		int p = sc.nextInt();
		
		printchar(str, p);
		
		sc.close();
		
	}
}
