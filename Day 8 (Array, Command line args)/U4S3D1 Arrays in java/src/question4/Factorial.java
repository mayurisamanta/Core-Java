package question4;

public class Factorial {
	public static void main(String[] args) {
		if (args.length == 1) {
			int num = Integer.parseInt(args[0]);
			int fac = 1;
			for (int i = 1; i <= num; i++) {
				fac *= i;
			}
			System.out.println(fac);
		}
		else if (args.length == 2) {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int diff;
			if (num1 > num2) {
				diff = num1 - num2;
			}
			else {
				diff = num2 - num1;
			}
			
			int fac = 1;
			for (int i = 1; i <= diff; i++) {
				fac = fac * i;
			}
			System.out.println(fac);
		}
		else {
			System.out.println("Error");
		}
		
	}
}
