package q3;

import java.util.Scanner;

public class Course {
	int courseId;
	
	String courseName;
	
	int courseFee;
	
	void displayCourseDetails() {
		System.out.println("Course id is : " + courseId);
		System.out.println("Course Name is : " + courseName);
		System.out.println("Course Fee is : " + courseFee);
	}
	
	static void authenticate(String username, String password) {
		if (username.equals("Admin") && password.equals("1234")) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Course Id");
			int id = sc.nextInt();
			
			System.out.println("Enter Course Name");
			String name = sc.next();
			
			System.out.println("Enter Course fee");
			int fee = sc.nextInt();
			
			sc.close();
			
		    Course c = new Course();
		    c.courseFee = fee;
		    c.courseId = id;
		    c.courseName = name;
		    c.displayCourseDetails();
		}
		else {
			System.out.println("Invalid Username or password");
		}
	}
	
	public static void main(String[] args) {
		authenticate ("Admin", "1234");
		authenticate ("Mayuri", "1234");
	}
}
