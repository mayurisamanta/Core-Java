package q3;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Student> t = new TreeSet<>();
		
		t.add(new Student(1, "Mayuri", 40, 50, 45));
		t.add(new Student(1, "Aayuri", 40, 50, 45));
		t.add(new Student(2, "Nayuri", 40, 50, 45));
		
		for (Student s : t) {
			System.out.println(s);
		}
		
	}

}
