package question3;

public class Bank {
	static Object getObject() {
		Bank b = new Bank();
		return b;
	}
	private Bank(){
	      System.out.println("Inside private constructor of Bank");
	 }
}
