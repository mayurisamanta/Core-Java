package question4;

public class Student {
	
	private int roll;
	
	private int marks;
	
	private char grade;
	
	private String name;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int roll, int marks, String name) {
		super();
		this.roll = roll;
		this.marks = marks;
		this.name = name;
		this.grade = calculateGrade();
	}

	public Student() {
		super();
	}
	
	public void displayDetails() {
		Student s = new Student(10, 500, "Mayuri");
		s.grade = calculateGrade();
		System.out.println("Student name is : " + s.name);
		System.out.println("Student roll is : " + s.roll);
		System.out.println("Student marks is : " + s.marks);
		System.out.println("Student Grade is : " + s.grade);
	}
	
	private char calculateGrade () {
		if (marks >= 500) {
			return 'A';
		}
		else if (marks < 500 && marks >= 400) {
			return 'B';
		}
		else {
			return 'C';
		}
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", marks=" + marks + ", grade=" + grade + ", name=" + name + "]";
	}
	
	
}
