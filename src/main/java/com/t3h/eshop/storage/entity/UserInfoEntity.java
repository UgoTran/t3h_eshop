package com.t3h.eshop.storage.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "user_info")
@Data
public class UserInfoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int userId;
    private String name;
    private String email;
    private String phoneNumber;
    private String image;
    private LocalDateTime createdAt = LocalDateTime.now();
}
