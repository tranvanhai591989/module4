package com.example.product_managment.repository;


import com.example.product_managment.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findProductByName();
    List<Product> findByName(String name);

}
