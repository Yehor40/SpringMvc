package com.example.springmvc.services;

import com.example.springmvc.domain.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;

@Service
public class ProductServiceImpl implements ProductService{
private Map<Integer, Product>products;
public ProductServiceImpl(){
    loadProducts();
}
    @Override
    public List<Product> listAllProducts() {
        return new ArrayList<>(products.values());
    }
    public void loadProducts(){

    products=new HashMap<>();
    Product product1 = new Product();
    product1.setId(1);
    product1.setDescription("product 1");
    product1.setPrice(new BigDecimal(100.99));
    product1.setImageUrl("localhot:8080");
    products.put(1,product1);

        Product product2 = new Product();
        product2.setId(2);
        product2.setDescription("product 2");
        product2.setPrice(new BigDecimal(1000.99));
        product2.setImageUrl("localhot:8081");
        products.put(2,product2);

        Product product3 = new Product();
        product3.setId(3);
        product3.setDescription("product 3");
        product3.setPrice(new BigDecimal(10.99));
        product3.setImageUrl("localhot:8082");
        products.put(3,product3);

    }
}
