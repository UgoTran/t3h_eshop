package com.t3h.eshop.storage.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
@Table(name = "order_details")
public class OrderDetailsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int orderId;
    private int productId;
    private int quantity;
    private double priceEach; //double
}
