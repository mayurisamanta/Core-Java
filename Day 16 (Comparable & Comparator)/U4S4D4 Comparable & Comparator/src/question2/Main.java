package question2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set<Employee> employees = new TreeSet<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many Employee you want to add?");
		
		int num = sc.nextInt();
		
		while (num-- > 0) {
			System.out.println("Enter Employee id");
			int id = sc.nextInt();
			
			System.out.println("Enter Employee name");
			String name = sc.next();
			
			System.out.println("Enter Employee salary");
			double salary = sc.nextDouble();
			
			Employee e = new Employee(id, name, salary);
			employees.add(e);
		}
		
		System.out.println(employees);
		
		sc.close();
	
	}
}
