package cart.repository;

import cart.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface CartRepository extends JpaRepository<Cart,Integer> {
}
