package com.pragma.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ProductServiceTest {

    @InjectMocks
    private ProductService productService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testCreateProduct() {
        Product product = new Product();
        product.setName("Test Product");
        product.setPrice(10.0);
        product.setStock(100);
        product.setCategory("Test Category");

        Product createdProduct = productService.createProduct(product);

        assertNotNull(createdProduct);
        assertEquals(product.getName(), createdProduct.getName());
        assertEquals(product.getPrice(), createdProduct.getPrice());
        assertEquals(product.getStock(), createdProduct.getStock());
        assertEquals(product.getCategory(), createdProduct.getCategory());
    }

    @Test
    public void testGetAllProducts() {
        List<Product> products = productService.getAllProducts();

        assertNotNull(products);
        assertEquals(Collections.emptyList(), products);
    }

    @Test
    public void testGetProductById() {
        Product product = new Product();
        product.setId(1L);
        product.setName("Test Product");
        product.setPrice(10.0);
        product.setStock(100);
        product.setCategory("Test Category");

        Product retrievedProduct = productService.getProductById(1L);

        assertNotNull(retrievedProduct);
        assertEquals(product.getId(), retrievedProduct.getId());
        assertEquals(product.getName(), retrievedProduct.getName());
        assertEquals(product.getPrice(), retrievedProduct.getPrice());
        assertEquals(product.getStock(), retrievedProduct.getStock());
        assertEquals(product.getCategory(), retrievedProduct.getCategory());
    }

    @Test
    public void testUpdateProduct() {
        Product product = new Product();
        product.setId(1L);
        product.setName("Test Product");
        product.setPrice(10.0);
        product.setStock(100);
        product.setCategory("Test Category");

        Product updatedProduct = productService.updateProduct(1L, product);

        assertNotNull(updatedProduct);
        assertEquals(product.getId(), updatedProduct.getId());
        assertEquals(product.getName(), updatedProduct.getName());
        assertEquals(product.getPrice(), updatedProduct.getPrice());
        assertEquals(product.getStock(), updatedProduct.getStock());
        assertEquals(product.getCategory(), updatedProduct.getCategory());
    }

    @Test
    public void testDeleteProduct() {
        productService.deleteProduct(1L);
        // No assertion needed as it's a void method
    }
}