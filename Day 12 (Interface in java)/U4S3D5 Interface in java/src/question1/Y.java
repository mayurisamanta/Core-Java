package question1;

public interface Y {

	//abstract method
	void fun4();
		
	//default method
	default void fun2() {
		System.out.println("Inside fun2(default) of Y");
	}
		
	//static method
	static void fun3() {
		System.out.println("Inside fun3(static) of Y");
	}
}
