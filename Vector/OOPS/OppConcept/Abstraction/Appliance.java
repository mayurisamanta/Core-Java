public abstract class Appliance {

    public abstract void turnOn();

    public static void main(String[] args) {
        Appliance washingMachine = new WashingMachine();
        washingMachine.turnOn();

        Appliance refrigerator = new Refrigerator();
        refrigerator.turnOn();
    }
}
