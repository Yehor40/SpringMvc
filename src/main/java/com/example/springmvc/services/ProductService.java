package com.example.springmvc.services;

import com.example.springmvc.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product>listAllProducts();
    Product getProductById(Integer id);
    Product saveUpdateProduct(Product product);
}
