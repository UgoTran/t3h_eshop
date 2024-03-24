package com.t3h.eshop.storage.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "cart")
@Entity
@Data
public class CartEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cart_id;
    private int product_id;
    private int qty;
    private int user_id;
    private String title;
    private double selling_price;
}
