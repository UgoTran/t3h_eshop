package com.t3h.eshop.storage.entiy;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "user_info")
@Data
public class UserInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "phone_number")
    private Integer phoneNumber;
    @Lob
    @Column(name = "image")
    private String image;
    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();

}
