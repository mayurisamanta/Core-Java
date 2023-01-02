package question7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1 = new Demo();
		
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d1);
		
		t1.setPriority(8);
		t2.setPriority(10);
		
		t1.setName("Dhoni");
		t2.setName("Kohli");
		
		t1.start();
		t2.start();
	}

}
