package question1;

public class Main {

	public static void main(String[] args) {
		Object[] obj = {new Student(23, "rakesh", 450),new Employee(12, "Lokesh", 84000),"String",50};
		
		Main m1 = new Main();
		Object[] ans = m1.changeArray(obj);
		
		for (Object i : ans) {
			System.out.println(i);
		}
	}
	
	Object[] changeArray(Object[] obj) {
		
		for (int i = 0; i < obj.length; i++) {
			if (obj[i] instanceof Student) {
				int marks = ((Student) obj[i]).getMarks();
				marks = marks + 10;
				((Student) obj[i]).setMarks(marks);
			}
			else if (obj[i] instanceof Employee) {
				double salary = ((Employee) obj[i]).getSalary();
				salary = salary + 10000;
				((Employee) obj[i]).setSalary(salary);
			}
			else if (obj[i] instanceof String) {
				int length = ((String) obj[i]).length();
				
				StringBuilder s = new StringBuilder();
				
				for (int j = length - 1 ; j >= 0 ; j--) {
					
					s.append(((String) obj[i]).charAt(j));
				}
				
				obj[i] = s;
			}
			else {
			    int j = ((int) obj[i]);
			    obj[i] = j+20;
			}
		}
		return obj;
	}

	
	
}
