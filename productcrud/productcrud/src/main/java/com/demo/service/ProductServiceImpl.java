
package com.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Product;
@Service
public class ProductServiceImpl implements ProductService {
	
	
    private List<Product> productList;

    public ProductServiceImpl() {
        // Initialize the product list
        this.productList = new ArrayList<>();
    }

    @Override
    public List<Product> getProducts() {
        return this.productList;
    }

    @Override
    public Product getProduct(long productId) {
        // Find and return product by ID
        for (Product product : productList) {
            if (product.getId() == productId) {
                return product;
            }
        }
        return null; // Return null if product not found
    }

    @Override
    public Product addProduct(Product product) {
        // Generate a unique ID for the product (You might have your own logic for this)
        long newProductId = productList.isEmpty() ? 1 : productList.get(productList.size() - 1).getId() + 1;
        product.setId(newProductId);
        // Add the product to the list
        productList.add(product);
        return product;
    }

    @Override
    public Product updateProduct(Product product) {
        // Find the product by ID and update it
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == product.getId()) {
                productList.set(i, product);
                return product;
            }
        }
        return null; // Return null if product not found
    }

    @Override
    public void deleteProduct(long productId) {
        // Remove the product by ID
        productList.removeIf(product -> product.getId() == productId);
    }
}
