package com.t3h.eshop.storage.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "payments")
public class PaymentsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int paymentId;
    private int orderId;
    private int customerId;
    private BigDecimal amount;
    private LocalDateTime paymentDate = LocalDateTime.now();
    private String mode;
}
