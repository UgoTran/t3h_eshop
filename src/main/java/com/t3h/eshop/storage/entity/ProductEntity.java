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
    private int productId;
    private String title;
    private int categoryBrandId;
    private String shortDescription;
    private String productFeatures;
    private double sellingPrice;
    private String image1;
    private String image2;
}
