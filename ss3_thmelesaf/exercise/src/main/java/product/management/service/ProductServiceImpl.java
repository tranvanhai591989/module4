package product.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
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
    @Modifying
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    @Modifying
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    @Modifying
    public void update(int id, Product product) {
        productRepository.update(id, product);
    }

    @Override
    @Modifying
    public void remove(int id) {
        productRepository.remove(id);
    }


    @Override
    @Modifying
    public List<Product> findByName(String name) {
        return productRepository.findByName(name);
    }

}
