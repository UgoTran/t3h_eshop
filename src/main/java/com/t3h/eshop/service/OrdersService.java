package com.t3h.eshop.service;

import com.t3h.eshop.storage.entiy.OrderDetailEntity;
import com.t3h.eshop.storage.entiy.OrdersEntity;

import java.util.List;

public interface OrdersService {
    List<Object[]>getOrdersByUserId(Integer userId);
//    List<OrdersEntity> getAll();
//    OrdersEntity creatOrder(OrdersEntity ordersEntity, List<OrderDetailEntity> orderDetailEntities);

}
