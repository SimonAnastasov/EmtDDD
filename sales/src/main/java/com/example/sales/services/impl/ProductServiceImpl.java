package com.example.sales.services.impl;

import com.example.sales.domain.models.Product;
import com.example.sales.domain.models.ProductId;
import com.example.sales.domain.repository.ProductRepository;
import com.example.sales.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public Product findById(ProductId id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
