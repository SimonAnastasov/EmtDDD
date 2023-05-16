package com.example.sales.services;

import com.example.sales.domain.models.Order;
import com.example.sales.domain.models.OrderId;

import java.util.List;

public interface OrderService {
    Order findById(OrderId id);
    List<Order> getAll();
}
