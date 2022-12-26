package question5;

public class Main {
	
	public static void main(String[] args) {
		
		FuelCar f = new FuelCar ();
		f.run();
		
		ElectricCar e = new ElectricCar();
		e.run();
		
		f.service();
		e.service();
	}
}
