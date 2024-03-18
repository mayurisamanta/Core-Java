public abstract class Restaurant {

    double discountThreshold;

    public Restaurant(double discountThreshold) {
        this.discountThreshold = discountThreshold;
    }

   public double calculateDiscount(double totalAmount){
         if (totalAmount >= discountThreshold){
             return getDiscount(totalAmount);
         }
            return 0;
   }

   public abstract double getDiscount(double totalAmount);


   public abstract double orderDish(Dish dish, int quantity);
}
