package question3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = Student.getStudent(false);
		System.out.println("Name is : " + s1.getName());
		System.out.println("Address is : " + s1.getAddress());
		System.out.println("Roll is : " + s1.getRoll());
		System.out.println("College is : " + s1.getCollegeName());
		
		Student s2 = Student.getStudent(true);
		System.out.println("Name is : " + s2.getName());
		System.out.println("Address is : " + s2.getAddress());
		System.out.println("Roll is : " + s2.getRoll());
		System.out.println("College is : " + s2.getCollegeName());
		
	}

}
