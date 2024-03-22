package com.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.model.Product;
@Service
public interface ProductService {
	public List<Product> getProducts();

	public Product getProduct(long productId);

	public Product addProduct(Product product);

	public Product updateProduct(Product product);

	public void deleteProduct(long productId); // New method declaration for deleteProduct
}
