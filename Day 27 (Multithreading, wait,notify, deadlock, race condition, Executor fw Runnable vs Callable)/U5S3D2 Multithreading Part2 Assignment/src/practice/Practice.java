package practice;

public class Practice implements Runnable{
	
	int sum = 0;

	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
		
//		synchronized (this) {
			
			for (int i = 0; i < 10; i++) sum += i;
//			this.notify();
//		}
		
		System.out.println(sum);
	}

}
