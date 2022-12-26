package question1;

public class OLA {
	
	public Car bookCar (int numberOfPassenger, int numberOfKMs) {
		if (numberOfPassenger <= 3) {
			Car c = new HatchBack();
			c.setNumberOfKms(numberOfKMs); 
			c.setNumberOfPassenger(numberOfPassenger);
			return c;
		}
		else {
			Car c = new Sedan();
			c.setNumberOfKms(numberOfKMs); 
			c.setNumberOfPassenger(numberOfPassenger);
			return c;
		}
		
	}
	
	public int calculateBill (Car car) {
		if (car instanceof HatchBack) {
			HatchBack c = (HatchBack) car;
			int farePerKm = c.farePerKm;
			int fare = (car.getNumberOfKms()) * farePerKm ;
			return fare;
		}
		else {
			Sedan c = (Sedan) car;
			int farePerKm = c.farePerKm;
			int fare = (car.getNumberOfKms()) * farePerKm ;
			return fare;
		}
	}
	
}
