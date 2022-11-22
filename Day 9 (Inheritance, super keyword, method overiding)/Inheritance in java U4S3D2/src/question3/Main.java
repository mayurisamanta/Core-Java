package question3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee();
		e1.name = "Mayuri";
		e1.address = "Navsari";
		e1.age = 21;
		e1.phoneNumber = "9265353136";
		e1.salary = 100000;
		
		System.out.println("Name is : " + e1.name);
		System.out.println("Address is : " + e1.address);
		System.out.println("Age is : " + e1.age);
		System.out.println("Phone number is : " + e1.phoneNumber);
		e1.printSalary();
		System.out.println("=========================================");
		
		

		Manager m1 = new Manager();
		m1.name = "Vijay";
		m1.address = "Navsari";
		m1.age = 18;
		m1.phoneNumber = "9265353136";
		m1.salary = 100000;
		
		System.out.println("Name is : " + m1.name);
		System.out.println("Address is : " + m1.address);
		System.out.println("Age is : " + m1.age);
		System.out.println("Phone number is : " + m1.phoneNumber);
		m1.printSalary();
		System.out.println("=========================================");
		
	}

}
