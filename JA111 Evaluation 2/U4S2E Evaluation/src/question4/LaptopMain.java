package question4;

import java.util.Scanner;

public class LaptopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner (System.in)) {
			System.out.println("Enter Laptop Purpose");
			String l = sc.next();
			if (l.equals("gaming")) {
				Laptop gamingLaptop = getLaptop("gaming");
				gamingLaptop.displayDetails();
			}
			if (l.equals("business")) {
				Laptop bussinessLaptop=getLaptop("business");
				bussinessLaptop.displayDetails();
			}
		}
	}
	public static Laptop getLaptop(String laptopPurpose) {
	    Laptop l1 = new Laptop();
		if (laptopPurpose.equals("gaming")) {
			l1.setColor("Black");
			l1.setCompanyName("Radeon");
			l1.setName("Acer");
			l1.setPurpose("gaming");
			l1.cpu.setClockSpeed(3200.0);
			l1.cpu.setManufacturer("Radeon");
			l1.cpu.setProcessor("Ryzen 9 5800H");
			l1.graphicCard.setCapacity("16GB");
			l1.graphicCard.setManufacturer("Radeon");
			l1.graphicCard.setSeries("RTX 3050 T");
		}
		else if (laptopPurpose.equals("business")) {
			l1.setColor("Rose Gold");
			l1.setCompanyName("HP");
			l1.setName("Aero 13");
			l1.setPurpose("business");
			l1.cpu.setClockSpeed(1800.0);
			l1.cpu.setManufacturer("Intel");
			l1.cpu.setProcessor("i5 10210U");
			l1.graphicCard.setCapacity("Integrated");
			l1.graphicCard.setManufacturer("Intel");
			l1.graphicCard.setSeries("Iris Xe");
		}
		else {
			l1 = null;
		}
		
		return l1;
	}
}
