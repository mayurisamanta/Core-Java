package question4;

final public class Child extends Parent{

	Child(int x) {
		super (x);
	}
	
	void method4 () {
		System.out.println("Inside method4 of Child");
	}
	
	@Override
	void method1() {
		System.out.println("Inside method1 of Child");
	}
	
	public static void main(String[] args) {
		Parent p1 = new Child(55);
		
		p1.method1();
		p1.method2();
		p1.method3();
		
		Child c1  = (Child) p1;
		c1.method4();
	}
	
}
