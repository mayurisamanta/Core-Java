public class Car {

    private String model;

    private Engine engine;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public static void main(String[] args) {
        Car car = new Car();
        Engine engine = new Engine();
        engine.setHorsePower(100);
        engine.setType("Petrol");
        car.setModel("Audi");
        car.setEngine(engine);
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Engine Horse Power: " + car.getEngine().getHorsePower());
        System.out.println("Engine Type: " + car.getEngine().getType());
    }
}
