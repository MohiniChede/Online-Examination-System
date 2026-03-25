package com.example.demo.controller;

import com.example.demo.entity.Category;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/")
    public Category addCategory(@RequestBody Category category) {
        return categoryService.addCategory(category);
    }

    @GetMapping("/{cid}")
    public Category getCategory(@PathVariable("cid") Long cid) {
        return categoryService.getCategory(cid);
    }

    @GetMapping("/")
    public List<Category> getCategories() {
        return categoryService.getCategories();
    }
}