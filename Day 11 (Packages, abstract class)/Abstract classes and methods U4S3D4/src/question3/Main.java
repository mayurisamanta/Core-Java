package question3;

public class Main {
	
	public static void main(String[] args) {
		Area a = new Area();
		int ans1 = a.circleArea(2);
		System.out.println(ans1);
		
		int ans2 = a.rectangleArea(4, 5);
		System.out.println(ans2);
		
		int ans3 = a.squareArea(5);
		System.out.println(ans3);
	}
}
