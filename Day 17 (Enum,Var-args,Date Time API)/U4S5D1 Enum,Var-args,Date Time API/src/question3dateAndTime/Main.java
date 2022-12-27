package question3dateAndTime;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDate addweek = date.plusWeeks(1);
		System.out.println(addweek);
		
		LocalDate addmonth = date.plusMonths(1);
		System.out.println(addmonth);
		
		LocalDate addyear = date.plusYears(1);
		System.out.println(addyear);
		
		LocalDate add10year = date.plusYears(10);
		System.out.println(add10year);
	}

}
