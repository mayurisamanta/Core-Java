public class Dish {

    private String name;
    private double price;

    public Dish(String name, double price) {
        this.name = name;
        if (price < 0) {
            this.price = 0;
        }
        else {
            this.price = price;
        }
    }

    public double getPrice() {
        return price;
    }

}
