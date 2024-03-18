public class ChineseRestaurant extends Restaurant{
    public ChineseRestaurant(double discountThreshold) {
        super(discountThreshold);
    }

    @Override
    public double getDiscount(double totalAmount) {
        return 5;
    }

    @Override
    public double orderDish(Dish dish, int quantity) {
        double totalPrice = dish.getPrice() * quantity;
        return totalPrice - calculateDiscount(totalPrice);
    }
}
