package question6;

import java.util.Scanner;

public class Main {

	public static double getStudent(int choice) {
		if (choice == 1) {
			
			Scanner sc = new Scanner (System.in);
			
			System.out.println("Enter the Marks for Hindi");
			int hindi = sc.nextInt();
			
			System.out.println("Enter the Marks for English");
			int english = sc.nextInt();
			
			System.out.println("Enter the Marks for History");
			int history = sc.nextInt();
			
			sc.close();
			
			ArtStudent a = new ArtStudent(hindi, english, history);
			
			return a.findPercentage();
			
		}
		else if (choice == 2) {
			
			Scanner sc = new Scanner (System.in);
			
			System.out.println("Enter the Marks for Maths");
			int maths = sc.nextInt();
			
			System.out.println("Enter the Marks for Chemistry");
			int chemistry = sc.nextInt();
			
			System.out.println("Enter the Marks for Physics");
			int physics = sc.nextInt();
			
			System.out.println("Enter the Marks for Biology");
			int biology = sc.nextInt();
			
			sc.close();
			
			ScienceStudent s = new ScienceStudent(physics, chemistry, maths, biology);
			
			return s.findPercentage();
			
		}
		else if (choice == 3) {
			
			Scanner sc = new Scanner (System.in);
			
			System.out.println("Enter the Marks for Accounts");
			int accounts = sc.nextInt();
			
			System.out.println("Enter the Marks for Economics");
			int economics = sc.nextInt();
			
			System.out.println("Enter the Marks for BusinessStudies");
			int businessStudies = sc.nextInt();
			
			sc.close();
			
			CommerceStudent c = new CommerceStudent(accounts, economics, businessStudies);
			
			return c.findPercentage();
		}
		return 0;
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Which Student percentage do you want to find:");
		System.out.println("1. ArtStudent\r\n"
				+ "2. ScienceStudent\r\n"
				+ "3. CommerceStudent");
		
		int choice =  sc.nextInt();
		
		
		double percentage = getStudent(choice);
		
		sc.close();
		System.out.println("Percentage is : " + percentage);
		
	}
}
