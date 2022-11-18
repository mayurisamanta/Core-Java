package question2;

public class Lion {
	
	String name;
	
	boolean isHungry;
	
	int age;
	
	static int totalDeaths;
	
	static void printKillings() {
		System.out.println("Total killings by lions in jungle = "+ totalDeaths);
	}
	
	void thinking() {
		if (isHungry == false) {
			System.out.println(name + " is Sleeping");
		}
		else {
			if (age > 12) {
				totalDeaths += 2;
				System.out.println(name + " has eaten two animals");
			}
			else if (age <= 12 && age >= 2) {
				totalDeaths += 1;
				System.out.println(name + " has eaten one animals");
			}
			else {
				System.out.println(name + " is calling Mom");
			}
		}
	}
	
	public static void main(String[] args) {
		
		Lion lion1 = new Lion();
		lion1.name = "lion1";
		lion1.age = 14;
		lion1.isHungry = true;
		lion1.thinking();
		printKillings();
		
		Lion lion2 = new Lion();
		lion2.name = "lion2";
		lion2.age = 10;
		lion2.isHungry = true;
		lion2.thinking();
		printKillings();
		
		Lion lion3 = new Lion();
		lion3.name = "lion3";
		lion3.age = 1;
		lion3.isHungry = false;
		lion3.thinking();
		printKillings();
	}
}
