package product.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import product.management.model.Product;
import product.management.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

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
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public void update(int id, Product product) {
        productRepository.update(id, product);
    }

    @Override
    public void remove(int id) {
        productRepository.remove(id);
    }


    @Override
    public List<Product> findByName(String name) {
        return productRepository.findByName(name);
    }

}
