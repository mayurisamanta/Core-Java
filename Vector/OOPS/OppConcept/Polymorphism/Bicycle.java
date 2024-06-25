public class Bicycle implements Movable{

    public void move() {
        System.out.println("Bicycle is moving");
    }

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.move();

        Car car = new Car();
        car.move();
    }
}
