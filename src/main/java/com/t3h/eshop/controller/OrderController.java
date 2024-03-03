package com.t3h.eshop.controller;

import com.t3h.eshop.storage.entity.OrderEntity;
import com.t3h.eshop.storage.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderRepo orderRepo;

    @GetMapping("/api/v1/orders")
    public ResponseEntity<List<OrderEntity>> orders(){
            return ResponseEntity.ok(orderRepo.findAll());
    }
}
