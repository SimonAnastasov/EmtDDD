package com.example.sales.services.impl;

import com.example.sales.domain.models.Cart;
import com.example.sales.domain.models.CartId;
import com.example.sales.domain.repository.CartRepository;
import com.example.sales.services.CartService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class CartServiceImpl implements CartService {
    private final CartRepository cartRepository;

    @Override
    public Cart findById(CartId id) {
        return null;
    }

    @Override
    public List<Cart> getAll() {
        return null;
    }
}
