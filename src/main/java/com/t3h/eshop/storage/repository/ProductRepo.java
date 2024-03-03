package com.t3h.eshop.storage.repository;

import com.t3h.eshop.storage.entity.CategoryEntity;
import com.t3h.eshop.storage.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductRepo extends JpaRepository<ProductEntity,String> {

}
