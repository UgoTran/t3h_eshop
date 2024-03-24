package com.t3h.eshop.service;

import com.t3h.eshop.storage.entiy.ProductEntity;

import java.util.List;

public interface ProductService {
    List<ProductEntity> getAll();
    ProductEntity add(ProductEntity productEntity);
    ProductEntity update(Integer id,ProductEntity productEntity);
    ProductEntity detail(Integer id);
    Boolean delete(Integer id);
}
