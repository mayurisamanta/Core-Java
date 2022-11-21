package question1;

import java.util.Scanner;

public class Reverse {

	public static String reversString(String input){
		//write the logic
		if (input == null) {
			return null;
		}

		char[] c = new char[input.length()];
		
		int line = input.length() - 1;
		for (int i = 0; i < input.length(); i++) {
			c[line] = input.charAt(i);
			line--;
		}
		
		String result = new String(c);
		
		return result;
	}
	
	public static void main(String[] args){
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a String to reverse");
			String orignalString = sc.next();
			String result = reversString(orignalString);
			System.out.println("Original String is :"+ orignalString);
			System.out.println("Reversed String is :"+ result);
		}
	}

}
