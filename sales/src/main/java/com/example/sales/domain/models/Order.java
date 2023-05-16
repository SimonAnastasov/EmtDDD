package com.example.sales.domain.models;

import com.example.sales.domain.valueobjects.PaymentDetails;
import com.example.sales.domain.valueobjects.ShipmentDetails;
import com.example.sharedkernel.domain.base.AbstractEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Order extends AbstractEntity<OrderId> {
    private ShipmentDetails shipmentDetails;
    private PaymentDetails paymentDetails;
    @ManyToOne
    private Cart cart;
}
