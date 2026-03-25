package com.example.demo.service;

import com.example.demo.entity.Category;
import com.example.demo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Cacheable(value = "categories", key = "#cid")
    public Category getCategory(Long cid) {
        return categoryRepository.findById(cid).orElse(null);
    }

    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }
}