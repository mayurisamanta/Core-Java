package question2;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {	
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter number of Students");
				int numOfStudents = sc.nextInt();
				sc.nextLine();
				int count = 1;
				
				for (int i = 0; i < numOfStudents; i++) {
					
					System.out.println("Enter name");
					String name = sc.nextLine();
					
					System.out.println("Enter roll number");
					int roll = sc.nextInt();
					
					System.out.println("Enter marks");
					int marks = sc.nextInt();
					
					sc.nextLine();
					
					Student s1 = new Student(roll, name, marks);
					
					System.out.println("Student Details " + count);
					System.out.println("Roll no : " + s1.getRollNumber());
					System.out.println("Name : " + s1.getStudentName());
					System.out.println("Marks : " + s1.getMarks());
					System.out.println("=================================");
					
					s1 = null;
					count++;
					
				
			}	
		}
	}	
}
