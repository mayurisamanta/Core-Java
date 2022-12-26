package question2;

public class Demo {
	
	Demo(){
		this("Mayuri");
		System.out.println("inside");
	}
	Demo(String s){
		this (10);
		System.out.println("inside str");
	}
	Demo(int i){
		this(10.55f);
		System.out.println("inside int");
	}
	Demo(float f){
		System.out.println("inside float");
	}
	
	public static void main(String[] args) {
		Demo d1 = new Demo();
	}
}
