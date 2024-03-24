package com.t3h.eshop.storage.repository;

import com.t3h.eshop.storage.entiy.OrdersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepository extends JpaRepository<OrdersEntity,Integer>{
    @Query("SELECT u.userId, od.qty, od.priceEach, p.title,o.expectedDeliveryDate,o.orderDate,o.status\n" +
            "FROM OrdersEntity o\n" +
            "JOIN OrderDetailEntity od ON o.orderId = od.orderId\n" +
            "JOIN UserInfoEntity u ON o.userId = u.userId\n" +
            "JOIN ProductEntity p ON od.productId = p.productId\n"+
            "WHERE u.userId = :userId")
    List<Object[]> findByUserId(Integer userId);
}
