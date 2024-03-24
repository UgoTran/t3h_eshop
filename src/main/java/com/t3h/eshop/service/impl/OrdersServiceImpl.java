package com.t3h.eshop.service.impl;

import com.t3h.eshop.service.OrdersService;
import com.t3h.eshop.storage.entiy.OrderDetailEntity;
import com.t3h.eshop.storage.entiy.OrdersEntity;
import com.t3h.eshop.storage.repository.OrderDetailRepository;
import com.t3h.eshop.storage.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersRepository ordersRepository;

    @Override
    public List<Object[]> getOrdersByUserId(Integer userId) {
        return ordersRepository.findByUserId(userId);
    }


//    @Override
//    public List<OrdersEntity> getOrdersByUserId(Integer userId) {
//        return ordersRepository.findByUserId(userId);
//    }
}
