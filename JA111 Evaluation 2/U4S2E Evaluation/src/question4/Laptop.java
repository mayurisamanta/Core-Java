package question4;

public class Laptop {
	private String color;
	
	private String companyName;
	
	private String name;
	
	private String purpose;
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	CPU cpu = new CPU();
	
	GraphicCard graphicCard = new GraphicCard();
	
	void displayDetails() {
		System.out.println("Laptop Name " + name);
		System.out.println("Company name " + companyName);
		System.out.println("Laptop Color " + color);
		System.out.println("Laptop Purpose " + purpose);
		System.out.println("Cpu's Manufacturer " + cpu.getManufacturer());
		System.out.println("Cpu's Processor " + cpu.getProcessor());
		System.out.println("Cpu's ClockSpeed " + cpu.getClockSpeed());
		System.out.println("Graphic card's Manufacturer " + graphicCard.getManufacturer());
		System.out.println("Graphic card's Seriesr " + graphicCard.getSeries());
		System.out.println("Graphic card's Capacity " + graphicCard.getCapacity());
	}
}
