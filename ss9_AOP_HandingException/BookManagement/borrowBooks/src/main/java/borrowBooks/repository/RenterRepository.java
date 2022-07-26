package borrowBooks.repository;

import borrowBooks.model.Renter;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface RenterRepository extends JpaRepository<Renter,Integer> {
}
