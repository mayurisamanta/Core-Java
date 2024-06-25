package com.vector;

import com.vector.dao.OrderDao;
import com.vector.dao.OrderDaoImpl;

public class Main {
    public static void main(String[] args) {
        OrderDao orderDao = new OrderDaoImpl();
        orderDao.createOrder();
        orderDao.getAllOrders();

    }
}