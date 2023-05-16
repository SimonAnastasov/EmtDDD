package com.example.sales.services.impl;

import com.example.sales.domain.models.Order;
import com.example.sales.domain.models.OrderId;
import com.example.sales.services.CartService;
import com.example.sales.services.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final CartService cartService;

    @Override
    public Order findById(OrderId id) {
        return null;
    }

    @Override
    public List<Order> getAll() {
        return null;
    }
}
