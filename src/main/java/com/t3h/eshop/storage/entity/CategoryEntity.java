package com.t3h.eshop.storage.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "category")
public class CategoryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int categoryId;
    private String title;
    private String imageLink;
}
