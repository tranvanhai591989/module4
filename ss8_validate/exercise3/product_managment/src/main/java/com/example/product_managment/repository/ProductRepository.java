package com.example.product_managment.repository;


import com.example.product_managment.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByName(String name);

}
