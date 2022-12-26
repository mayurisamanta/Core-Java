package question3;

public class Area extends Shape{

	@Override
	public int rectangleArea(int length, int breadth) {
		return length * breadth;
	}

	@Override
	public int squareArea(int side) {
		return 2 * side;
	}

	@Override
	public int circleArea(int radius) {
		return (22/7) * (radius * radius);
	}

}
