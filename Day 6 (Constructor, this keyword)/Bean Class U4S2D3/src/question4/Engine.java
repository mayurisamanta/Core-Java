package question4;

public class Engine {
	
	int rmp;
	
	int Power;
	
	String manufacturer;
	
	boolean hasTurbo;

	void enableTurbo () {
		this.hasTurbo = true;
	}

	public Engine(int rmp, int power, String manufacturer) {
		super();
		this.rmp = rmp;
		this.Power = power;
		this.manufacturer = manufacturer;
		enableTurbo();
	}

	public Engine() {
		super();
	}
	
	
}
