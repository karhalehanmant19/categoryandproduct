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

import com.demo.model.Product;
import com.demo.service.ProductService;

@RestController
public class MyController {
    
    @Autowired
    private ProductService productService;
    
    // Welcome message
    @GetMapping("/home")
    public String home() {
        return "Welcome to products application";
    }
    
    // Get all products
    @GetMapping("/products")
    public List<Product> getProducts() {
        return this.productService.getProducts();
    }
    
    // Get single product by ID
    @GetMapping("/products/{productId}")
    public Product getProduct(@PathVariable long productId) {
        return this.productService.getProduct(productId);
    }
    
    // Add a new product
    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        return this.productService.addProduct(product);
    }
    
    // Update an existing product
    @PutMapping("/products/{productId}")
    public Product updateProduct(@PathVariable long productId, @RequestBody Product product) {
        product.setId(productId); // Set ID for the product
        return this.productService.updateProduct(product);
    }
    
    // Delete a product by ID
    @DeleteMapping("/products/{productId}")
    public void deleteProduct(@PathVariable long productId) {
        this.productService.deleteProduct(productId);
    }
}
