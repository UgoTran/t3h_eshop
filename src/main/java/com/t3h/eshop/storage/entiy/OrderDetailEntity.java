package com.t3h.eshop.storage.entiy;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "order_details")
@Data
public class OrderDetailEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "order_id", insertable = false, updatable = false) // Thêm insertable và updatable ở đây
    private String orderId;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrdersEntity order;
    @Column(name = "product_id")
    private Integer productId;
    @Column(name = "qty")
    private Integer qty;
    @Column(name = "price_each")
    private BigDecimal priceEach;

}
