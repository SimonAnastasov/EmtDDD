package com.example.sales.domain.valueobjects;

import com.example.sharedkernel.domain.base.ValueObject;
import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class PaymentDetails implements ValueObject {
    private final String cardHolder;
    private final String cardNumber;
    private final String cardSecurityCode;
    private final String cardExpirationDate;

    protected PaymentDetails() {
        this.cardHolder = "";
        this.cardNumber = "";
        this.cardSecurityCode = "";
        this.cardExpirationDate = "";
    }
}
