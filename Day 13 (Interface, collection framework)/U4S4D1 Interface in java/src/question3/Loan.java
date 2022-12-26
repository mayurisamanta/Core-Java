package question3;

public class Loan {

	public static double calculateLoanAmount(Employee employeeObj) {
		double loanAmt;
		if (employeeObj instanceof PermanentEmployee) {
			 loanAmt = employeeObj.getSalary() * 15 / 100;
		}
		else {
			 loanAmt = employeeObj.getSalary() * 10 / 100;
		}
		return loanAmt;
	}
}
