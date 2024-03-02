package com.t3h.eshop.storage.repository;

import com.t3h.eshop.storage.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<OrderEntity, String> {

}
