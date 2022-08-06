package exchangeRealty.repository;

import exchangeRealty.model.Exchange;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository

public interface ExchangeRepository extends JpaRepository<Exchange, Integer> {
    @Query(value = "select exchange.* from exchange left join customer c on exchange.customer_id = c.customer_id where c.customer_name like :search and exchange_type like :exchange_type",
            nativeQuery = true)
    Page<Exchange> findAllExchange(@Param("search") String name, @Param("exchangeType") String exchange_type, Pageable pageable);
}
