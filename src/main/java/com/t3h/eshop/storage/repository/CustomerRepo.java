package com.t3h.eshop.storage.repository;

import com.t3h.eshop.storage.entity.CustomerProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<CustomerProfileEntity,String> {
}
