package travelcustomer.travelcustomer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import travelcustomer.travelcustomer.model.PassengerInfo;

public interface PassengerInfoRepository extends JpaRepository<PassengerInfo,Long> {
}
