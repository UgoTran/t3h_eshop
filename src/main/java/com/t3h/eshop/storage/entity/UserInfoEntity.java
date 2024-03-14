package com.t3h.eshop.storage.entity;

import jakarta.persistence.*;
import lombok.Data;

import javax.management.relation.Role;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_info")
@Data
public class UserInfoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int userId;
    //private String name;
    @Column(nullable = false,unique = true,length = 40)
    private String email;
    @Column(nullable = false,unique = true,length = 10)
    private String password;
    //@Enumerated(EnumType.STRING)
    private Role role;
    //private String phoneNumber;
    //private String image;
    //private LocalDateTime createdAt = LocalDateTime.now();
    public UserInfoEntity(){}
    public UserInfoEntity(String email,String password,Role role){
        this.email=email;
        this.password=password;
        this.role=role;
    }


    public UserInfoEntity(String email, String password, com.t3h.eshop.storage.Role role) {
    }
}
