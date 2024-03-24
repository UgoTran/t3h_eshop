package com.t3h.eshop.service;

import com.t3h.eshop.storage.entiy.CategoryEntity;

import java.awt.print.Pageable;
import java.util.List;

public interface CategoryService {
    List<CategoryEntity> getAll();
    CategoryEntity add(CategoryEntity categoryEntity);
    CategoryEntity update(CategoryEntity categoryEntity,Integer id);
    CategoryEntity detail(Integer id);
    Boolean delete(Integer id);
    List<CategoryEntity> search(String keyword);
    List<CategoryEntity>findAll(Pageable pageable);
}
