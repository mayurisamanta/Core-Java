package q3;

public class Student implements Comparable<Student>{

	public Student() {
		super();
	}

	public Student(int rollNo, String name, int mathsMarks, int scienceMarks, int engMarks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.mathsMarks = mathsMarks;
		this.scienceMarks = scienceMarks;
		this.engMarks = engMarks;
	}

	private int rollNo;
	
	private String name;
	
	private int mathsMarks;
	
	private int scienceMarks;
	
	private int engMarks;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMathsMarks() {
		return mathsMarks;
	}

	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}

	public int getScienceMarks() {
		return scienceMarks;
	}

	public void setScienceMarks(int scienceMarks) {
		this.scienceMarks = scienceMarks;
	}

	public int getEngMarks() {
		return engMarks;
	}

	public void setEngMarks(int engMarks) {
		this.engMarks = engMarks;
	}

	int totalMarks() {
		return engMarks + scienceMarks + mathsMarks;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", mathsMarks=" + mathsMarks + ", scienceMarks="
				+ scienceMarks + ", engMarks=" + engMarks + "]";
	}

	@Override
	public int compareTo(Student o) {
		Student s1 = this;
		Student s2 = o;
		
		if (s1.totalMarks() == s2.totalMarks()) {
			if (s1.getName().equals(s2.getName())) {
				if (s1.getRollNo() > s2.getRollNo()) {
					return 1;
				}
				else if (s1.getRollNo() < s2.getRollNo()) {
					return -1;
				}
				else {
					return 0;
				}
			}
			else {
				int i =  s1.getName().compareTo(s2.getName());
				if (i < 0) {
					return 1;
				}
				else if (i > 0) {
					return -1;
				}
				else {
					return 0;
				}
			}
		}
		else {
			if (s1.totalMarks() > s2.totalMarks()) {
				return 1;
			}
			else if (s1.totalMarks() < s2.totalMarks()) {
				return -1;
			}
			else {
				return 0;
			}
		}
		
		
	}
	
	
}
