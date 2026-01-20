package com.kay.espresso.service;

import com.kay.espresso.model.Order;
import com.kay.espresso.model.OrderStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class OrderService {

    private final List<Order> orders = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong(1);

    public Order create(Order order) {
        order.setId(counter.getAndIncrement());
        order.setStatus(OrderStatus.PREPARANDO);
        orders.add(order);
        return order;
    }

    public List<Order> list() {
        return orders;
    }

    public Order updateStatus(Long id, OrderStatus status) {
        return orders.stream()
                .filter(o -> o.getId().equals(id))
                .findFirst()
                .map(o -> {
                    o.setStatus(status);
                    return o;
                })
                .orElseThrow(() -> new RuntimeException("Order not found"));
    }
}
