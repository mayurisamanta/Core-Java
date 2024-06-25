public class Shape {

    public void draw() {
        System.out.println("Drawing a shape");
    }

    public static void main(String[] args) {
        Shape[] shapes = {new Circle(), new Rectangle()};
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
