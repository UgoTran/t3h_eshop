package com.t3h.eshop.storage.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Data
public class OrderEntity {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String orderId;
    private LocalDateTime orderDate;
    private LocalDate expectedDeliveryDate;
    private LocalDateTime canceledDate;
    private LocalDateTime shippedDate;
    private String status;
    private String sortDescription;

}
