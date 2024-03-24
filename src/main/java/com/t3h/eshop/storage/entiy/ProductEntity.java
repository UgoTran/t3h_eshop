package com.t3h.eshop.storage.entiy;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "product")
@Data
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer productId;
    @ManyToOne
    @JoinColumn(name = "category_brand_id")
    private CategoryEntity categoryEntity;
    @Column(name = "title")
    private String title;
    @Column(name = "short_description")
    private String shortDescription;
    @Column(name = "product_features")
    private String productFeatures;
    @Column(name = "selling_price")
    private String sellingPrice;
    @Column(name = "image1")
    private String image1;
    @Column(name = "image2")
    private String image2;


}
