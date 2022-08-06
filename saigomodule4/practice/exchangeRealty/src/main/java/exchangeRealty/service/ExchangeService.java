package exchangeRealty.service;

import exchangeRealty.model.Exchange;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ExchangeService {
    Page<Exchange> findAllExchange(String name, String exchangeType, Pageable pageable);

    void save(Exchange exchange);

    void deleteExchangeByExchangeId(int id);

    Optional<Exchange> findByiId(int id);

}
