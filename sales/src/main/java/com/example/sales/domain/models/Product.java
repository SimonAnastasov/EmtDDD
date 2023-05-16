package com.example.sales.domain.models;

import com.example.sales.domain.valueobjects.NutritionValue;
import com.example.sales.domain.valueobjects.ProductCategory;
import com.example.sales.domain.valueobjects.Quantity;
import com.example.sharedkernel.domain.base.AbstractEntity;
import com.example.sharedkernel.domain.financial.Money;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Product extends AbstractEntity<ProductId> {
    private String productName;
    private Quantity quantity;

    @AttributeOverrides({
        @AttributeOverride(name = "amount", column = @Column(name = "price_amount")),
        @AttributeOverride(name = "currency", column = @Column(name = "price_currency"))
    })
    private Money price;

    private ProductCategory category;
    private NutritionValue nutritionValues;
}
