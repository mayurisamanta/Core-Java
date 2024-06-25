package com.vector.dao;

import com.vector.entity.Order;
import com.vector.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class OrderDaoImpl implements OrderDao{

        private List<Order> orderList = new ArrayList<>();

        private Integer orderId = 0;
        private Integer productId = 0;

        @Override
        public void createOrder() {
            Order order = new Order(++orderId);
            List<Product> productList = new ArrayList<>();
            productList.add(new Product(++productId, "Product1", 100.0));
            productList.add(new Product(++productId, "Product2", 200.0));
            productList.add(new Product(++productId, "Product3", 300.0));
            System.out.println("Order created");
        }

        @Override
        public void getAllOrders() {
            for(Order order : orderList){
                System.out.println("Order Id: "+order.getOrderId());
                for(Product product : order.getProductList()){
                    System.out.println("Product Id: "+product.getProductId());
                    System.out.println("Product Name: "+product.getProductName());
                    System.out.println("Product Price: "+product.getProductPrice());
                }
            }
        }
}
