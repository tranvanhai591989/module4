package travelcustomer.travelcustomer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import travelcustomer.travelcustomer.model.PaymentInfo;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo,String> {
}
