package practice;

public class Thread1 implements Runnable{
	
	Common c;
	String name;

	
	

	public Thread1(Common c, String name) {
		this.c = c;
		this.name = name;
	}




	@Override
	public void run() {
		// TODO Auto-generated method stub
		c.fun1(name);
	}

	
}
