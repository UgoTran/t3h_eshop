package com.t3h.eshop.storage.repository;

import com.t3h.eshop.storage.entiy.OrderDetailEntity;
import com.t3h.eshop.storage.entiy.OrdersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetailEntity,Integer>{

}
