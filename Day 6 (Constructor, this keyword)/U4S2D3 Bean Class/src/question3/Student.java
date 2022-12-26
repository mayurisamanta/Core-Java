package question3;

public class Student {
	private int roll;
	
	private String name;
	
	private String address;
	
	private String collegeName;
	
	
	
	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCollegeName() {
		return collegeName;
	}


	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	

	public Student() {
		super();
	}


	public Student(int roll, String name, String address, String collegeName) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collegeName = collegeName;
	}


	public Student(int roll, String name, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collegeName = "NIT";
	}
	
	public static Student getStudent(boolean isFromNIT) {
		if (isFromNIT) {
			Student s1 = new Student(10, "Mayuri", "Navsari");
			return s1;
		}
		else if (isFromNIT == false) {
			Student s1 = new Student(10, "Mayuri", "Navsari", "Vnsgu");
			return s1;
		}
		else {
			Student s1 = null;
			return s1;
		}
	}
}
