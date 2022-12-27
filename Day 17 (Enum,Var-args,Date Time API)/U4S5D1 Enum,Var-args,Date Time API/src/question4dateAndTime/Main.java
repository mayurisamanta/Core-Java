package question4dateAndTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start date in dd-MM-yyyy format");
		String startdate = sc.next();
		System.out.println("Enter end date in dd-MM-yyyy format");
		String enddate = sc.next();
		try{
			LocalDate d1 = LocalDate.parse(startdate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			LocalDate d2 = LocalDate.parse(enddate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			Long diff = ChronoUnit.DAYS.between(d1, d2);
			if (diff <= 0) {
				System.out.println("Start date should be smaller than End date");
			}
			else {
				System.out.println("Wages are " + diff * 1200);
			}
			
			
			
				
		}catch (Exception e){
			System.out.println("Please enter Date in valid pattern");
		}
		
		sc.close();
	}
}
