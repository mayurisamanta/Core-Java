package question3;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Runnable even = () -> {
			for (int i = 1; i <= 20; i++) {
				if (i % 2 == 0) System.out.print(i + " ");
			}
		};
		
		Runnable odd = () -> {
			for (int i = 1; i <= 20; i++) {
				if (i % 2 == 1) System.out.print(i + " ");
			}
		};
		
		Thread t1 = new Thread(even);
		Thread t2 = new Thread(odd);
		
		t1.start();
		t1.join();
		
		t2.start();
	}
}
