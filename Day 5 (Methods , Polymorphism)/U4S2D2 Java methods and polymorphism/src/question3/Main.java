package question3;

public class Main {
	
	public static void main(String[] args) {
		
		Shapes shape = new Shapes();
		
		Circle circle = new Circle();
		circle.radius = 2;
		shape.area(circle);
		
		Rectangle rectangle = new Rectangle();
		rectangle.breadth = 4;
		rectangle.length = 5;
		shape.area(rectangle);
		
		Square square = new Square();
		square.side = 5;
		shape.area(square);
		
	}
	
}
