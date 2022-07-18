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
        return productList = productRepository.getData();
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Product findById(int id) {
        Product product = null;
        for (Product item : productList) {
            if (item.getId() == id) {
                product = item;
            }
        }
        return product;
    }

    @Override
    public void update(int id, Product product) {
        List<Product> productList2 =productRepository.getData();
        for (int i = 0; i <productList2.size() ; i++) {
            if (productList2.get(i).getId()== id) {
                productList2.get(i).setId(product.getId());
                productList2.get(i).setName(product.getName());
                productList2.get(i).setPrice(product.getPrice());
                productList2.get(i).setMoment(product.getMoment());
                productList2.get(i).setDetail(product.getDetail());
                productList2.get(i).setProducer(product.getProducer());
            }
        }
    }

    @Override
    public void remove(int id) {
        List<Product> productList2 =productRepository.getData();
        for (int i = 0; i <productList2.size() ; i++) {
            if (productList2.get(i).getId()==id) {
                productList2.remove(productList2.get(i));
            }
        }
//        productList2.removeIf(item -> item.getId() == id);
    }


    @Override
    public List<Product> findByName(String name) {
        List<Product> productList2 =productRepository.getData();
        List<Product> productList1 = new ArrayList<>();
        for (Product item : productList2) {
            if (item.getName().contains(name)) {
                productList1.add(item);
            }
        }
        return productList1;
    }

}
