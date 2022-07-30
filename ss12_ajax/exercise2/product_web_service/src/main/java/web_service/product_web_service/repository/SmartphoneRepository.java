package web_service.product_web_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web_service.product_web_service.model.Smartphone;

@Repository
public interface SmartphoneRepository extends JpaRepository<Smartphone,Long> {
}
