package com.vector.entity;

import java.util.List;

public class Order {
    private Integer orderId;
    private List<Product> productList;

    public Order(Integer orderId, List<Product> productList) {
        this.orderId = orderId;
        this.productList = productList;
    }

    public Order(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
