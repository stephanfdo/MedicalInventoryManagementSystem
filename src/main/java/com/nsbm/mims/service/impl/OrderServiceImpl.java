package com.nsbm.mims.service.impl;

import com.nsbm.mims.model.Order;
import com.nsbm.mims.repository.OrderRepository;
import com.nsbm.mims.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order getOrder(Long orderId) {
        return orderRepository.findById(orderId).orElse(null);
    }

    @Override
    public Order updateOrder(Long orderId, Order orderDetails) {
        Order order = getOrder(orderId);
        if (order == null)
            return null;

        // Update order details
        order.setItemId(orderDetails.getItemId());
        order.setQuantity(orderDetails.getQuantity());
        // Update other fields as needed

        return orderRepository.save(order);
    }

    @Override
    public void deleteOrder(Long orderId) {
        orderRepository.deleteById(orderId);
    }
}
