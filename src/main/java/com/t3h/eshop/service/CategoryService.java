package com.t3h.eshop.service;

import com.t3h.eshop.storage.entity.CategoryEntity;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<CategoryEntity> getAllCategory();

    void saveCate(CategoryEntity category);

    void deleteCate(int categoryId);

    Optional<CategoryEntity> findCateById(int categoryId);
}
