package com.demo.service;

import java.util.List;

import com.demo.entites.Categories;

public interface CategoriesService {

    public List<Categories> getCategories();
    
    public Categories getCategory(long categoryId);
    
    public Categories addCategory(Categories category);
    
    public Categories updateCategory(Categories category);
    
    public void deleteCategory(long categoryId); // New method declaration for deleteCategory
}
