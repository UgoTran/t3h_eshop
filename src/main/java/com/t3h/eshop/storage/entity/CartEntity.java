package com.t3h.eshop.storage.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "cart")
@Entity
@Data
public class CartEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cartId;
    private int productId;
    private int qty;
    private int userId;
    private String title;
    private double sellingPrice;
}
