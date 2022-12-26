package question4;

public class Parent {
	
	Parent (int x){
		this.number = x;
	}
	
	final int number;
	
	void method1 () {
		if (number >= 0 && number <= 10) {
			System.out.println(number);
		}
		System.out.println("Inside method1 of Parent");
	}
	
	final void method2 () {
		System.out.println("Inside method2 of Parent");
	}

	void method3 () {
		System.out.println("Inside method3 of Parent");
	}
}
