package borrowBooks.service;

import borrowBooks.model.Renter;
import borrowBooks.repository.RenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RenterServiceImpl implements RenterService {
    @Autowired
    private RenterRepository renterRepository;


    @Override
    public void save(Renter renter) {
        renterRepository.save(renter);
    }

    @Override
    public Renter findByCode(String code) {
        return renterRepository.findByCodeContains(code);
    }

    @Override
    public void delete(Renter renter) {

    }
}
