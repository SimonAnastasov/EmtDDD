package com.example.sales.domain.models;

import com.example.sharedkernel.domain.base.AbstractEntity;
import jakarta.persistence.ManyToMany;

import java.util.List;

public class Cart extends AbstractEntity<CartId> {
    @ManyToMany
    private List<Product> products;
}
