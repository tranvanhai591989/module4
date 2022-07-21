package product.management.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import product.management.model.Product;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ProductRepositoryImpl implements ProductRepository {


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Product> findAll() {
        TypedQuery<Product> query = entityManager.createQuery(
                "select p from Product as p ", Product.class);
        return query.getResultList();
    }

    @Override
    @Modifying
    public void save(Product products) {
        entityManager.persist(products);
    }



    @Override
    public void update(int id, Product products) {
        entityManager.merge(products);
    }

    @Override
    @Modifying
    public void remove(int id) {
        Product products = findById(id);
        entityManager.remove(products);
    }
//        productList2.removeIf(item -> item.getId() == id);

    @Override
    public Product findById(int id) {
        return entityManager.createQuery(
                "select p from Product as p where p.id=:id ", Product.class).
                setParameter("id", id).getSingleResult();
    }
    @Override
    public List<Product> findByName(String name) {
        TypedQuery<Product> query = entityManager.createQuery(
                "select p from Product as p where p.name like ?1", Product.class).setParameter(1, "%" + name + "%");

        return query.getResultList();
    }
}
