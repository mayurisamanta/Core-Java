package practice;

public class Common {

//	synchronized public void fun1(String name)  {
//		System.out.println("Welcome");
//		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println(name);
//	}
	
	 public void fun1(String name)  {
		 
		 synchronized (this) {
			
		
		System.out.println("Welcome");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(name);
		
		 }
	}
}
