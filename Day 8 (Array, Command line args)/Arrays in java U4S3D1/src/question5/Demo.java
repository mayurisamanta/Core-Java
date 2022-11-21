package question5;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter number of Students");
			int numOfStudents = sc.nextInt();
			sc.nextLine();
			
			int count = 0;
			Student[] arr = new Student[numOfStudents];
			for (int i = 0; i < numOfStudents; i++) {
				
				System.out.println("Enter name");
				String name = sc.nextLine();
				
				System.out.println("Enter address");
				String address = sc.nextLine();
				
				System.out.println("Enter roll number");
				int roll = sc.nextInt();
				
				System.out.println("Enter marks");
				int marks = sc.nextInt();
				
				sc.nextLine();
				
				Student s1 = new Student(roll, name, address, marks);
				
				arr[count] = s1;
				count++;
				s1 = null;
			}
			int sum = 0;
			for (Student i : arr) {
				System.out.println("Name is : " + i.getName());
				System.out.println("Address is : " + i.getAddress());
				System.out.println("Roll no is : " + i.getRoll());
				System.out.println("Marks is : " + i.getMarks());
				System.out.println("========================================");
				sum += i.getMarks();
			}
			
			System.out.println("Average marks is : " + sum/arr.length);
		}
	}
}
