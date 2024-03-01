package com.t3h.eshop.storage.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name ="refund")
public class RefundEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int refundId;
    private int orderId;
    private int productId;
    private BigDecimal refundAmount;
    private String status;
    private LocalDateTime updateAt = LocalDateTime.now();
}
