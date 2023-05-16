package com.example.sales.domain.valueobjects;

import com.example.sharedkernel.domain.base.ValueObject;
import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class ShipmentDetails implements ValueObject {
    private final String address;
    private final String city;
    private final String country;

    protected ShipmentDetails() {
        this.address = "";
        this.city = "";
        this.country = "";
    }
}
