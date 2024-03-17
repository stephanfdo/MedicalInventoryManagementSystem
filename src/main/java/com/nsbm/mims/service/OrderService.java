package com.nsbm.mims.service;

import com.nsbm.mims.model.Order;

public interface OrderService {
    Order createOrder(Order order);

    Order getOrder(Long orderId);

    Order updateOrder(Long orderId, Order orderDetails);

    void deleteOrder(Long orderId);
}