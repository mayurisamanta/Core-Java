package question3;

public class Students {
	
	int roll;
	
	String name;
	
	int marks;
	
	void displayStudentDetails() {
		System.out.println("Roll is : " + roll);
		System.out.println("Name is : " + name);
		System.out.println("Marks is : " + marks);
	}
	
	public static void main(String[] args) {
		Students s1 = new Students();
		s1.roll = 1;
		s1.name = "Mayuri";
		s1.marks = 95;
		s1.displayStudentDetails();
		
		Students s2 = new Students();
		s2.roll = 2;
		s2.name = "Vijay";
		s2.marks = 90;
		s2.displayStudentDetails();
		
		s1 = null;
		s2 = null;
	}
}
