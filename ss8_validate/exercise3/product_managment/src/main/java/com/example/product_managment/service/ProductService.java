package com.example.product_managment.service;

import com.example.product_managment.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAll();

    void save(Product product);

    Optional<Product> findById(int id);

    void update( Product product);

    void remove(int id);

    List<Product> findProductByName(String name);
}
