package q4;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashSet<Employee> array =  new HashSet<>();
		
		int i = 1;
		
		while (true) {
			
			System.out.println("Enter the Employee Details: " + i);
			System.out.println("=====================================");
			
			System.out.println("Enter the Employee Id:");
			int id = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Enter the Employee Name:");
			String name = sc.nextLine();
			
			System.out.println("Enter the Employee Salary:");
			int salary = sc.nextInt();
			
			System.out.println("Enter the Department Id:");
			int dId = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Enter the Department Name:");
			String DName = sc.nextLine();
			
			Department d = new Department(dId, DName);
			
			Employee e = new Employee(id, name, salary, d);
			
			Boolean b = array.add(e);
			if (b == false) {
				System.out.println("Employee with this id already exists");
			}
			else {
				System.out.println("Employee Details added successfully.");
			}
			
			i++;
			
			System.out.println("Do you want to Enter the detail of Employee: ? (Y/N)");
			String s = sc.next();

			if (s.equalsIgnoreCase("n") == true) {
				break;
			}
		}
		
		
		while (true) {
			System.out.println("Enter the your choice\r\n"
					+ "1: Find Employee in Particular Department\r\n"
					+ "2: Remove Particular Employee\r\n"
					+ "3: Print Employees in All Departments");
			int choice = sc.nextInt();
			
			if (choice == 1) {
				System.out.println("Enter the Department Id: ");
				int id = sc.nextInt();
				
				for (Employee e : array) {
					if (e.getDepartment().getDepartmentId() == id) {
						System.out.println(e);
					}
				}
			}
			else if (choice == 2) {
				System.out.println("Enter Department Id:");
				int Did = sc.nextInt();
				
				System.out.println("Enter the Employee Id:");
				int id = sc.nextInt();
				
				for (Employee e : array) {
					if (e.getDepartment().getDepartmentId() == Did && e.getEmployeeId() == id) {
						System.out.println( e.getEmployeeName() +" Employee is removed from the department 1 successfully.");
						array.remove(e);
						break;
					}
				}
				
			}
			else if (choice == 3) {
				for (Employee e : array) {
					System.out.println(e);
					System.out.println("=======================================");
				}
			}
			
			System.out.println("Do you want to Exit: ? (Y/N)\r\n");
			String s = sc.next();
			if (s.equalsIgnoreCase("y") == true) {
				System.out.println("Thank you");
				break;
			}
		}
		sc.close();
		
	}
}
