package question3;

public class PermanentEmployee extends Employee{

	private double basicPay ;


	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
		calculateSalary();
	}



	
	
	
	
	@Override
	void calculateSalary() {
		double PfAmount = basicPay * 0.12;
		salary = basicPay - PfAmount;
		
	}
	
	

}
