package question7;

public class Demo implements Runnable{

	@Override
	public void run() {
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " Thread Priority :" + Thread.currentThread().getPriority() + " Thread Name : " + Thread.currentThread().getName());
		}
		
	}

}