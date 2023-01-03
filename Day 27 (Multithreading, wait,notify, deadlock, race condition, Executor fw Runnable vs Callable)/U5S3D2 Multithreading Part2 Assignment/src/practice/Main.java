package practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
//		Practice p = new Practice();
//		
//		Thread t = new Thread(p);
//		
//		t.start();
//		
//		Thread.sleep(5000);
//		t.join();
//		
//		System.out.println(p.sum);
//		
//		System.out.println("end");
		
		
		// If running on two different object then sync cannot help
//		Common c1 = new Common();
//		Common c2 = new Common();
//		
//		Thread1 t1 = new Thread1(c1, "Mayuri");
//		Thread2 t2 = new Thread2(c2, "Samanta");
//		
//		Thread th1 = new Thread(t1);
//		Thread th2 = new Thread(t2);
//		
//		th1.setPriority(10);
//		th2.setPriority(1);
//		
//		th1.start();
//		th2.start();
//	
//		
//		Practice p = new Practice();
//		
//		Thread t = new Thread(p);
//		
//		t.start();
//		
//	    synchronized (t) {
//			t.wait();
//			System.out.println(p.sum);
//		}
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		Practice[] p = {
				new Practice(),
				new Practice()
		};
		
		for (Practice pp : p) {
			service.submit(pp);
		}
		
		service.shutdown();
		
	}

}
