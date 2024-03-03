package com.t3h.eshop.storage.repository;

import com.t3h.eshop.storage.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerProfileRepo extends JpaRepository<CategoryEntity,String> {
}
