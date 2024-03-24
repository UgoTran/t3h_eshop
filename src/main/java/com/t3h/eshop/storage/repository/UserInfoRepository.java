package com.t3h.eshop.storage.repository;

import com.t3h.eshop.storage.entiy.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfoEntity,Integer> {
}
