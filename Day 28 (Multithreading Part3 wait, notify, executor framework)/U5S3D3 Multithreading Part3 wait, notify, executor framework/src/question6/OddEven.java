package question6;

import java.util.concurrent.Callable;

public class OddEven implements Callable<String>{
	
	public int num;
	
	OddEven(int num){
		this.num = num;
	}

	@Override
	public String call() throws Exception {
		if(num % 2 == 0) return "Even " + num;
		else return "Odd " + num ;
	}

}
