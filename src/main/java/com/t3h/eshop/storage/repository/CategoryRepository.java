package com.t3h.eshop.storage.repository;

import com.t3h.eshop.storage.entiy.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity,Integer>{

    @Query("SELECT c FROM CategoryEntity c where c.title LIKE %?1%")
    List<CategoryEntity>searchCategory(String keyword);
}
