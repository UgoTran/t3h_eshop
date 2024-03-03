package com.t3h.eshop.service;

import com.t3h.eshop.storage.entity.CartEntity;

import java.util.List;

public interface CartService {
    List<CartEntity> getAllCart();
    void deleteCart(int cart_id);
}
