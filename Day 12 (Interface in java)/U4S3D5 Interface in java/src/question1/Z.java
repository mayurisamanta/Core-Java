package question1;

public interface Z extends X,Y{

	
	//abstract method
	void fun7();

	@Override
	default void fun2() {
		// TODO Auto-generated method stub
		X.super.fun2();
	}
	
	
}
