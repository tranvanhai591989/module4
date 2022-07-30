package usejquery.jquery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import usejquery.jquery.model.Smartphone;

@Repository
public interface SmartphoneRepository extends JpaRepository<Smartphone,Long> {
}
