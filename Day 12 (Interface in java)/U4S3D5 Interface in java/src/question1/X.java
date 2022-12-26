package question1;

public interface X {
	
	//abstract method
	void fun1();
	
	//default method
	default void fun2() {
		System.out.println("Inside fun2(default) of X");
	}
	
	//static method
	static void fun3() {
		System.out.println("Inside fun3(static) of X");
	}

}
