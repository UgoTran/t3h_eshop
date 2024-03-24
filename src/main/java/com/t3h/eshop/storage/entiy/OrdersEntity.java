package com.t3h.eshop.storage.entiy;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
@Data
public class OrdersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private String orderId;
    @Column(name = "order_date")
    private LocalDateTime orderDate;
    @Column(name = "expected_delivery_date")
    private LocalDateTime  expectedDeliveryDate;
    @Column(name = "canceled_date")
    private LocalDateTime  canceledDate;
    @Column(name = "shipped_date")
    private LocalDateTime  shippedDate;
    @Column(name = "status")
    private String status;
    @Column(name = "sort_description")
    private String sortDescription;
    @Column(name = "user_id")
    private Integer userId;

    @OneToMany(mappedBy = "order", fetch = FetchType.EAGER)
    private List<OrderDetailEntity> orderDetails;
}
