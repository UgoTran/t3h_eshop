package com.t3h.eshop.storage.repository;

import com.t3h.eshop.storage.entity.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CartRepo extends JpaRepository<CartEntity,String> {
    @Query(value = "INSERT INTO cart (product_id, qty, user_id, selling_price, title) " +
            "SELECT p.product_id, :qty AS qty, :user_id AS user_id, p.selling_price, p.title " +
            "FROM product p " +
            "WHERE p.product_id = :productId", nativeQuery = true)
    void addToCart(@Param("productId") int productId,
                   @Param("qty") int qty,
                   @Param("user_id") int userId);
}
