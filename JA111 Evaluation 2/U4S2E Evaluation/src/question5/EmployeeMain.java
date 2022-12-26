package question5;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1 = getEmployeeDetails();
		System.out.println("Id : " + e1.getEmployeeId());
		System.out.println("Name : " + e1.getEmployeeName());
		System.out.println("Salary : " + e1.getSalary());
		System.out.println("Net Salary : " + e1.getNetSalary() );
	}
	
	public static Employee getEmployeeDetails() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Id");
			int id = sc.nextInt();
			
			System.out.println("Enter Name");
			String name = sc.next();
				
			System.out.println("Enter salary:");
			int salary = sc.nextInt();
				
			System.out.println("Enter PF percentage");
			int pf = sc.nextInt();
			
			Employee e1 = new Employee(id, name, salary, pf);
			
			return e1;
		}
		
		
	}
	
}
