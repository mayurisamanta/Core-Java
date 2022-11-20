package q2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the String");
		String s = sc.nextLine();
		
		System.out.println("Enter the character position you want to access");
		int p = sc.nextInt();
		sc.close();
		
		getCharacter (s, p);
	}
	
	static void getCharacter (String s, int p) {
		
		System.out.println(s.charAt(p));
	}

}
