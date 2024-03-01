package com.t3h.eshop.storage.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "customer_profile")
public class CustomerProfileEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int profileId;
    private String name;
    private String email;
    private String houseNo;
    private String roadArea;
    private String city;
    private String district;
    private int userId;
}
