package question1;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		
		Calculation c = new Calculation();
		
		Thread t = new Thread(c);
		synchronized (t) {
			
			
			t.start();
			t.wait();
			System.out.println(c.mul);
		}
	}

}
