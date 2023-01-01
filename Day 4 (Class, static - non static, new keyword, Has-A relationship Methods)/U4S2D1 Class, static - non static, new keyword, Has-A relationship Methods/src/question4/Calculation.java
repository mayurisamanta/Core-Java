package question4;

public class Calculation {
	
	void print(int n) {
		
		if (n < 0) {
			System.out.println("Error");
		}
		else if (n % 2 == 0) {
			int x = (n/10 * 10 + 10);
			System.out.println(x);
		}
		else if (n % 2 != 0) {
			System.out.println(n);
		}
	}
	
	public static void main(String[] args) {
		Calculation c1 = new Calculation();
		c1.print(14);
	}
	
}
