package question6;

public class CommerceStudent implements Student{

	private int accountMarks;
	
	private int economicsMarks;
	
	private int businessStudiesMarks;

	public int getAccountMarks() {
		return accountMarks;
	}

	public void setAccountMarks(int accountMarks) {
		this.accountMarks = accountMarks;
	}

	public int getEconomicsMarks() {
		return economicsMarks;
	}

	public void setEconomicsMarks(int economicsMarks) {
		this.economicsMarks = economicsMarks;
	}

	public int getBusinessStudiesMarks() {
		return businessStudiesMarks;
	}

	public void setBusinessStudiesMarks(int businessStudiesMarks) {
		this.businessStudiesMarks = businessStudiesMarks;
	}

	public CommerceStudent(int accountMarks, int economicsMarks, int businessStudiesMarks) {
		super();
		this.accountMarks = accountMarks;
		this.economicsMarks = economicsMarks;
		this.businessStudiesMarks = businessStudiesMarks;
	}

	public CommerceStudent() {
		super();
	}

	@Override
	public double findPercentage() {
	
		int total = accountMarks + economicsMarks + businessStudiesMarks;
		
		double per = (total * 100) / 300;
		
		return per;
	}
	
	
}
