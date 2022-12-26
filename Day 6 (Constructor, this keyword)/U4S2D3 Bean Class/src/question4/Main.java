package question4;

public class Main {
	
	public static void main(String[] args) {
		
		Engine e = new Engine();
		e.manufacturer = "tata";
		e.Power = 110;
		e.rmp = 10000;
		e.enableTurbo();
		
		Car c = new Car();
		c.Color = "black";
		c.companyName = "Tata";
		c.model = "Harrier";
		c.engine = e;
		
		System.out.println("Car Model : " + c.model);
		System.out.println("Car companyName : " + c.companyName);
		System.out.println("Car color : " + c.Color);
		System.out.println("Car RPM : " + c.engine.rmp);
		System.out.println("Car power : " + c.engine.Power);
		System.out.println("Car Engine Manufacture : " + c.engine.manufacturer);
		System.out.println("Car Has Turbo : " + c.engine.hasTurbo);
		
		Engine e1 = new Engine(10000, 110, "tata");
		
		
		Car c1 = new Car("Harrier", "Tata", "black", e1);
		
		
		System.out.println("Car Model : " + c1.model);
		System.out.println("Car companyName : " + c1.companyName);
		System.out.println("Car color : " + c1.Color);
		System.out.println("Car RPM : " + c1.engine.rmp);
		System.out.println("Car power : " + c1.engine.Power);
		System.out.println("Car Engine Manufacture : " + c1.engine.manufacturer);
		System.out.println("Car Has Turbo : " + c1.engine.hasTurbo);
				
				
				
	}
}
