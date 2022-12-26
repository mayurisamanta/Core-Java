package question3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a Loan object by name loan
		double permanentEmployeeLoan = Loan.calculateLoanAmount(new PermanentEmployee(10, "Mayuri", 1000));
		double temporaryEmployeeLoan = Loan.calculateLoanAmount(new TemporaryEmployee(2, "Vijay", 20, 100));
		System.out.println("Loan Amount for Permanent Employee => "+permanentEmployeeLoan);
		System.out.println("Loan Amount for Temporary Employee => "+temporaryEmployeeLoan);
	}

}
