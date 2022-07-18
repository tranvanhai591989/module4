package product.management.repository;

import org.springframework.stereotype.Repository;
import product.management.model.Product;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private static List<Product> products = new ArrayList<>();

    static {

        products.add(new Product(1, "Table", 15, 30, "hinh tron", "Ha Tinh"));
        products.add(new Product(2, "Phone", 23, 9, "hinh tam giac", "Quang Nam"));
        products.add(new Product(3, "Machine", 43, 99, "hinh vuong", "Da Nang"));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public Product findById(int id) {
        Product product = null;
        for (Product item : products) {
            if (item.getId() == id) {
                product = item;
            }
        }
        return product;
    }

    @Override
    public void update(int id, Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.get(i).setId(product.getId());
                products.get(i).setName(product.getName());
                products.get(i).setPrice(product.getPrice());
                products.get(i).setMoment(product.getMoment());
                products.get(i).setDetail(product.getDetail());
                products.get(i).setProducer(product.getProducer());
            }
        }
    }

    @Override
    public void remove(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(products.get(i));
            }
        }
//        productList2.removeIf(item -> item.getId() == id);
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> productList1 = new ArrayList<>();
        for (Product item : products) {
            if (item.getName().contains(name)) {
                productList1.add(item);
            }
        }
        return productList1;
    }
}
