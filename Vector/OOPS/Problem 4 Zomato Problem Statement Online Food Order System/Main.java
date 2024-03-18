public class Main {

    public static void main(String[] args) {

        Dish pizza = new Dish("Pizza", 20);
        Dish sushi = new Dish("Sushi", 10);
        Restaurant italianRestaurant = new ItalianRestaurant(50); // 10% discount over $50
        Restaurant chineseRestaurant = new ChineseRestaurant(30); // $5 discount over $30
        System.out.println("Italian Restaurant order total: " + italianRestaurant.orderDish(pizza, 3)); // 3 pizzas
        System.out.println("Chinese Restaurant order total: " + chineseRestaurant.orderDish(sushi, 4)); // 4 sushis
    }
}
