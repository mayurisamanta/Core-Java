public class ItalianRestaurant extends Restaurant {
    public ItalianRestaurant(double discountThreshold) {
        super(discountThreshold);
    }

    @Override
    public double getDiscount(double totalAmount) {
        return totalAmount * 0.1;
    }

    @Override
    public double orderDish(Dish dish, int quantity) {
        double totalPrice = dish.getPrice() * quantity;
        return totalPrice - calculateDiscount(totalPrice);

    }
}
