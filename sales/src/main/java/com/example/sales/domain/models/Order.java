package com.example.sales.domain.models;

import com.example.sales.domain.valueobjects.OrderStatus;
import com.example.sales.domain.valueobjects.PaymentDetails;
import com.example.sales.domain.valueobjects.ShipmentDetails;
import com.example.sharedkernel.domain.base.AbstractEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Table(name = "shop_order")
public class Order extends AbstractEntity<OrderId> {
    private ShipmentDetails shipmentDetails;
    private PaymentDetails paymentDetails;
    @Setter
    private OrderStatus orderStatus;
    @ManyToOne
    private Cart cart;
}
