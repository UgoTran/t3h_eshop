package com.t3h.eshop.storage.entiy;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "category")
@Data
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Integer categoryId;
    @Column(name = "title")
    private String title;
    @Column(name = "image_link")
    private String imageLink;
}
