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
    private String tilte;
    private int categoryId;
    private String shortDescription;
    private String productFeatures;
    private BigDecimal sellingPrice;
    private String image1;
    private String image2;
}
