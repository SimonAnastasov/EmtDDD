package com.example.sales.domain.valueobjects;

import com.example.sharedkernel.domain.base.ValueObject;
import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class NutritionValue implements ValueObject {
    private final int calories;
    private final int fat;
    private final int saturatedFat;
    private final int carbohydrates;
    private final int sugar;
    private final int protein;
    private final int salt;

    protected NutritionValue() {
        this.calories = 0;
        this.fat = 0;
        this.saturatedFat = 0;
        this.carbohydrates = 0;
        this.sugar = 0;
        this.protein = 0;
        this.salt = 0;
    }
}
