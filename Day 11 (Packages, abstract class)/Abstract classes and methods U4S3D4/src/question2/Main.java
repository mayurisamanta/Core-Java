package question2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no.of employees");
		int num = sc.nextInt();
		
		if (num == 1 || num == 0) {
			System.out.println("Please enter a valid employee count");
		}
		else {	
			int[] age = new int[num];
			int line = 0;
			System.out.println("Enter the age for " + num + " employees");
			for (int i = 0; i < num; i++) {
				int j = sc.nextInt();
				age[line] = j;
				line++;
			}
			calculateAverage(age);
		}
		sc.close();
		
	}
	
	static void calculateAverage (int[] age){
		int sum = 0;
		for (int i = 0; i < age.length; i++) {
			sum += age[i];
		}
		double average = sum / age.length;
		System.out.println("Average age is : " + average);
	}
	
}
