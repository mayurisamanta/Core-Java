package question6;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		OddEven[] callables = {
				new OddEven(2),
				new OddEven(19),
				new OddEven(25),
				new OddEven(3),
				new OddEven(7),
				new OddEven(10)
		};
		
		for (OddEven obj : callables) {
			Future<String> f = service.submit(obj);
			System.out.println(f.get());
		}
		
		service.shutdown();
	}
}
