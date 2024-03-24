package com.t3h.eshop.service.impl;

import com.t3h.eshop.service.ProductService;
import com.t3h.eshop.storage.entiy.ProductEntity;
import com.t3h.eshop.storage.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<ProductEntity> getAll() {
        return productRepository.findAll();
    }

    @Override
    public ProductEntity add(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }

    @Override
    public ProductEntity update(Integer id, ProductEntity productEntity) {
        ProductEntity productEntity1=productRepository.findById(id).orElse(null);
        productEntity1.setCategoryEntity(productEntity.getCategoryEntity());
        productEntity1.setProductFeatures(productEntity.getProductFeatures());
        productEntity1.setTitle(productEntity.getTitle());
        productEntity1.setSellingPrice(productEntity.getSellingPrice());
        productEntity1.setShortDescription(productEntity.getShortDescription());
        productEntity1.setImage1(productEntity.getImage1());
        productEntity1.setImage2(productEntity.getImage2());
        return productRepository.save(productEntity1);
    }

    @Override
    public ProductEntity detail(Integer id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Boolean delete(Integer id) {
        this.productRepository.deleteById(id);
        return true;
    }
}
