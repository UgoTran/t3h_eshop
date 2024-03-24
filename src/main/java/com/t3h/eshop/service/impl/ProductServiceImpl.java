package com.t3h.eshop.service.impl;

import com.t3h.eshop.service.ProductService;
import com.t3h.eshop.storage.entity.CategoryEntity;
import com.t3h.eshop.storage.entity.ProductEntity;
import com.t3h.eshop.storage.repository.CategoryRepo;
import com.t3h.eshop.storage.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepo productRepo;

    @Override
    public List<ProductEntity> getAllProduct() {
        return (List<ProductEntity>) productRepo.findAll();
    }
}
