package com.pragma.domain;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    public Product createProduct(Product product) {
        // Logic to create product
        return product;
    }

    public List<Product> getAllProducts() {
        // Logic to get all products
        return List.of();
    }

    public Product getProductById(Long id) {
        // Logic to get product by ID
        return new Product();
    }

    public Product updateProduct(Long id, Product product) {
        // Logic to update product
        return product;
    }

    public void deleteProduct(Long id) {
        // Logic to delete product
    }
}