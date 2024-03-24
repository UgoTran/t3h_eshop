package com.t3h.eshop.service;

import com.t3h.eshop.storage.entity.CategoryEntity;
import com.t3h.eshop.storage.entity.ProductEntity;

import java.util.List;

public interface ProductService {
    List<ProductEntity> getAllProduct();
}
