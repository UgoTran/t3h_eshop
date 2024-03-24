package com.t3h.eshop.service.impl;

import com.t3h.eshop.service.CategoryService;
import com.t3h.eshop.storage.entiy.CategoryEntity;
import com.t3h.eshop.storage.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public List<CategoryEntity> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public CategoryEntity add(CategoryEntity categoryEntity) {
        return categoryRepository.save(categoryEntity);
    }

    @Override
    public CategoryEntity update(CategoryEntity categoryEntity, Integer id) {
        CategoryEntity categoryEntity1=categoryRepository.findById(id).orElse(null);
        categoryEntity1.setTitle(categoryEntity.getTitle());
        categoryEntity1.setImageLink(categoryEntity.getImageLink());
        return categoryRepository.save(categoryEntity1);
    }

    @Override
    public CategoryEntity detail(Integer id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public Boolean delete(Integer id) {
        categoryRepository.deleteById(id);
        return true;
    }

    @Override
    public List<CategoryEntity> search(String keyword) {
        return this.categoryRepository.searchCategory(keyword);
    }

    @Override
    public List<CategoryEntity> findAll(Pageable pageable) {
        return null;
    }
}
