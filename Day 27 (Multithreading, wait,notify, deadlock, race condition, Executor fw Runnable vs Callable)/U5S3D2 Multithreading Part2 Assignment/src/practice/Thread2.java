package practice;

public class Thread2 implements Runnable{
	
	Common c;
	String name;

	
	

	public Thread2(Common c, String name) {
		this.c = c;
		this.name = name;
	}




	@Override
	public void run() {
		// TODO Auto-generated method stub
		c.fun1(name);
	}

	
}
