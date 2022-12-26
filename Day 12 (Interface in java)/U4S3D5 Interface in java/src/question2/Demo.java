package question2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Amount");
		int amount = sc.nextInt();
		
		sc.close();
		if (amount >= 200) {
			Hotel h = provideFood (amount);
			if (h instanceof TajHotel) {
				h.chickenBiryani();
				h.masalaDosa();
				((TajHotel) h).welcomeDrink();
			}
			else {
				h.chickenBiryani();
				h.masalaDosa();
			}
		}
		else {
			System.out.println("Enter Valid Amount");
		}

	}
	
	public static Hotel provideFood(int amount) {
		if (amount >= 200 && amount <= 1000) {
			Hotel h = new RoadSideHotel();
			return h;
		}
		else if (amount > 1000) {
			Hotel h = new TajHotel();
			return h;
		}
		return null;
		
	}

}
