package question2;

public class Main {

	public static void main(String[] args) {

		Animal[] arr = new Animal[3];
		arr[0] = new Dog();
		arr[1] = new Cat();
		arr[2] = new Tiger();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].eat();
			arr[i].walk();
			arr[i].makeNoise();
		}
	}

}
