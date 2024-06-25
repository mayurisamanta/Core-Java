public class MathOperations {

    public int multiply(int a, int b) {
        return a * b;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        System.out.println(mathOperations.multiply(2, 3));
        System.out.println(mathOperations.multiply(2, 3, 4));
        System.out.println(mathOperations.multiply(2.5, 3.5));
    }
}
