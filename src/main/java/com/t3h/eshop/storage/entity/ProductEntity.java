package com.t3h.eshop.storage.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
@Table(name = "product")
public class ProductEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int product_id;
    private String title;
    private int category_brand_id;
    private String short_description;
    private String product_features;
    private double selling_price;
    private String image1;
    private String image2;
}
