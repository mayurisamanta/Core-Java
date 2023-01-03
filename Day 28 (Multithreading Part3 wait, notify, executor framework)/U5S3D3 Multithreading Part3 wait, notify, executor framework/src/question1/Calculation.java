package question1;

public class Calculation implements Runnable{
	
	int mul = 1;

	@Override
	public void run() {
		
		synchronized (this) {
			
			for (int i = 1; i <= 10; i++) mul *= i;
			
			this.notify();
		}

	}

}
