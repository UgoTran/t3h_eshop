package com.t3h.eshop.storage.repository;

import com.t3h.eshop.storage.entity.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserInfoEntity, Integer> {
    public UserInfoEntity findByEmail(String email);
}
