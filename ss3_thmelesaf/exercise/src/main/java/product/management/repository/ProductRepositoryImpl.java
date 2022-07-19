package product.management.repository;

import org.springframework.stereotype.Repository;
import product.management.model.Product;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class ProductRepositoryImpl implements ProductRepository {


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Product> findAll() {
        TypedQuery<Product> query = entityManager.createQuery(
                "select m from product as m", Product.class);
        return query.getResultList();
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public Product findById(int id) {
        return entityManager.createQuery(
                "select p from Product as p where p.id=:id ", Product.class).
                setParameter("id", id).getSingleResult();
    }

    @Override
    public void update(int id, Product product) {
      entityManager.merge(product);
    }

    @Override
    public void remove(int id) {
        entityManager.createQuery("delete from Product as p where p.id=:id ", Product.class).setParameter("id", id).getSingleResult();

    }
//        productList2.removeIf(item -> item.getId() == id);


    @Override
    public List<Product> findByName(String name) {
        entityManager.find(Music,i)
    }
}
