package exchangeRealty.service;

import exchangeRealty.model.Exchange;
import exchangeRealty.repository.ExchangeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExchangeServiceImpl implements ExchangeService {
    private final ExchangeRepository exchangeRepository;

    public ExchangeServiceImpl(ExchangeRepository exchangeRepository) {
        this.exchangeRepository = exchangeRepository;
    }

    @Override
    public Page<Exchange> findAllExchange(String name, String exchangeType, Pageable pageable) {
        return exchangeRepository.findAllExchange("%" + name + "%", "%" + exchangeType + "%", pageable);
    }

    @Override
    public void save(Exchange exchange) {
        exchangeRepository.save(exchange);
    }

    @Override
    public void deleteExchangeByExchangeId(int id) {
        exchangeRepository.deleteById(id);

    }

    @Override
    public Optional<Exchange> findByiId(int id) {
        return exchangeRepository.findById(id);
    }
}
