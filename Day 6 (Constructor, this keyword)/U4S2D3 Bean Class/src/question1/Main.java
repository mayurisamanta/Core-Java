package question1;

public class Main {

	public static void main(String[] args) {
		Student obj1 = new Student();
		obj1.setRoll(10);
		obj1.setAge(18);
		obj1.setMarks(200);
		obj1.setName("Mayuri");
		
		System.out.println(obj1.getName());
		System.out.println(obj1.getAge());
		System.out.println(obj1.getRoll());
		System.out.println(obj1.getMarks());
		
		Student obj2 = new Student(25, "Vijay", 15, 500);
		System.out.println(obj2.getName());
		System.out.println(obj2.getAge());
		System.out.println(obj2.getRoll());
		System.out.println(obj2.getMarks());
	}

}
