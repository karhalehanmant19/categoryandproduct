package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entites.Categories; // Assuming Category entity exists
import com.demo.service.CategoriesService; // Assuming CategoryService exists

@RestController
public class MyController {
    
    @Autowired
    private CategoriesService categoryService;
    
    // Welcome message
    @GetMapping("/home")
    public String home() {
        return "Welcome to categories application";
    }
    
    // Get all categories
    @GetMapping("/categories")
    public List<Categories> getCategories() {
        return this.categoryService.getCategories();
    }
    
    // Get single category by ID
    @GetMapping("/categories/{categoryId}")
    public Categories getCategory(@PathVariable Long categoryId) {
        return this.categoryService.getCategory(categoryId);
    }
    
    // Add a new category
    @PostMapping("/categories")
    public Categories addCategory(@RequestBody Categories category) {
        return this.categoryService.addCategory(category);
    }
    
    // Update an existing category
    @PutMapping("/categories/{categoryId}")
    public Categories updateCategory(@PathVariable Long categoryId, @RequestBody Categories category) {
        category.setId(categoryId); // Set ID for the category
        return this.categoryService.updateCategory(category);
    }
    
    // Delete a category by ID
    @DeleteMapping("/categories/{categoryId}")
    public void deleteCategory(@PathVariable Long categoryId) {
        this.categoryService.deleteCategory(categoryId);
    }
}
