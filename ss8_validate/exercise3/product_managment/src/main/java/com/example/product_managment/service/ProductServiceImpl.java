package com.example.product_managment.service;

import com.example.product_managment.model.Product;
import com.example.product_managment.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    private List<Product> productList = new ArrayList<>();

    @Override
    public List<Product> findAll() {
        return productList = productRepository.findAll();
    }

    @Override
    @Modifying
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    @Modifying
    public Optional<Product> findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    @Modifying
    public void update(Product product) {
        productRepository.save(product);
    }

    @Override
    @Modifying
    public void remove(int id) {
        productRepository.deleteById(id);
    }


    @Override
    @Modifying
    public List<Product> findProductByName(String name) {
        return productRepository.findByName(name);
    }

}
