package question1;

public class Main {

	public static Person generatePerson(Person person) {
		return  person;
	}
	
	public static void main(String[] args) {
		Address studentAdd = new Address("Navsari", "Gujarat", "396445");
		Address instructorAdd = new Address("Bangalore", "Karnataka", "556816");
		Person newStudent = generatePerson(new Student("Mayuri", "Female", studentAdd, 0672, "Java", 300000));

		Person newTeacher = generatePerson(new Instructor("Yogesh", "Male", instructorAdd, 01, 10000000));

		System.out.println(newStudent);
		System.out.println(newTeacher);

	}
}
