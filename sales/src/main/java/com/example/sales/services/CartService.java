package com.example.sales.services;

import com.example.sales.domain.models.Cart;
import com.example.sales.domain.models.CartId;

import java.util.List;

public interface CartService {
    Cart findById(CartId id);
    List<Cart> getAll();
}
