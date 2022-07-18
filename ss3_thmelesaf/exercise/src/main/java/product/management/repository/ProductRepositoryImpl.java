package product.management.repository;

import org.springframework.stereotype.Repository;
import product.management.model.Product;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private static List<Product> product = new ArrayList<>();

    static {

        product.add(new Product(1, "Table", 15, 30, "hinh tron", "Ha Tinh"));
        product.add(new Product(2, "Phone", 23, 9, "hinh tam giac", "Quang Nam"));
        product.add(new Product(3, "Machine", 43, 99, "hinh vuong", "Da Nang"));
    }

    @Override
    public List<Product> getData() {
        return product;
    }
}
