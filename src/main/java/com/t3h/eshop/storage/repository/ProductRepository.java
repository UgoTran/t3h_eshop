package com.t3h.eshop.storage.repository;

import com.t3h.eshop.storage.entiy.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Integer> {
}
