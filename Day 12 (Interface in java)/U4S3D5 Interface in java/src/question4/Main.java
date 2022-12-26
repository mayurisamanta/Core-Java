package question4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Test t = new Test();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one integer");
		int num = sc.nextInt();
		sc.close();
		
		int[] arr= t.display(num);//Take this argument from user using the Scanner class
		//Write the logic to print the elements
		
		for (int i : arr) {
			if (i != 0) {
				System.out.println(i);
			}
		}
	}
}
