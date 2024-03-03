package com.t3h.eshop.service.impl;

import com.t3h.eshop.service.CartService;
import com.t3h.eshop.storage.entity.CartEntity;
import com.t3h.eshop.storage.repository.CartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CartImpl implements CartService {
    @Autowired private CartRepo cartRepo;
    @Override
    public List<CartEntity> getAllCart() {
        return (List<CartEntity>) cartRepo.findAll();
    }

    @Override
    public void deleteCart(int cart_id) {
        cartRepo.deleteById(String.valueOf(cart_id));
    }

}
