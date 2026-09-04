package com.pragma.api;

import com.pragma.domain.Product;
import com.pragma.domain.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import java.util.Collections;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class ProductControllerTest {

    @Mock
    private ProductService productService;

    @InjectMocks
    private ProductController productController;

    private MockMvc mockMvc;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(productController).build();
    }

    @Test
    public void testCreateProduct() throws Exception {
        Product product = new Product();
        product.setName("Test Product");
        product.setPrice(10.0);
        product.setStock(100);
        product.setCategory("Test Category");

        when(productService.createProduct(any(Product.class))).thenReturn(product);

        mockMvc.perform(post("/products")
                       .contentType(MediaType.APPLICATION_JSON)
                       .content("{\"name\":\"Test Product\",\"price\":10.0,\"stock\":100,\"category\":\"Test Category\"}"))
               .andExpect(status().isCreated())
               .andExpect(jsonPath("$.name").value("Test Product"));
    }

    @Test
    public void testGetAllProducts() throws Exception {
        when(productService.getAllProducts()).thenReturn(Collections.singletonList(new Product()));

        mockMvc.perform(get("/products"))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$.[0].name").exists());
    }

    @Test
    public void testGetProductById() throws Exception {
        Product product = new Product();
        product.setId(1L);
        product.setName("Test Product");
        product.setPrice(10.0);
        product.setStock(100);
        product.setCategory("Test Category");

        when(productService.getProductById(1L)).thenReturn(product);

        mockMvc.perform(get("/products/1"))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$.name").value("Test Product"));
    }

    @Test
    public void testUpdateProduct() throws Exception {
        Product product = new Product();
        product.setId(1L);
        product.setName("Updated Product");
        product.setPrice(20.0);
        product.setStock(200);
        product.setCategory("Updated Category");

        when(productService.updateProduct(1L, any(Product.class))).thenReturn(product);

        mockMvc.perform(put("/products/1")
                       .contentType(MediaType.APPLICATION_JSON)
                       .content("{\"name\":\"Updated Product\",\"price\":20.0,\"stock\":200,\"category\":\"Updated Category\"}"))
               .andExpect(status().isOk())
               .andExpect(jsonPath("$.name").value("Updated Product"));
    }

    @Test
    public void testDeleteProduct() throws Exception {
        doNothing().when(productService).deleteProduct(1L);

        mockMvc.perform(delete("/products/1"))
               .andExpect(status().isNoContent());
    }
}