package com.t3h.eshop.service.impl;

import com.t3h.eshop.service.CategoryService;
import com.t3h.eshop.storage.entity.CategoryEntity;
import com.t3h.eshop.storage.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired private CategoryRepo categoryRepo;

    @Override
    public List<CategoryEntity> getAllCategory() {
        return (List<CategoryEntity>) categoryRepo.findAll();
    }

    @Override
    public void saveCate(CategoryEntity category) {
        categoryRepo.save(category);
    }

    @Override
    public void deleteCate(int categoryId) {

    }

    @Override
    public Optional<CategoryEntity> findCateById(int categoryId) {
        return Optional.empty();
    }
}
