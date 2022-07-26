package borrowBooks.service;

import borrowBooks.model.Renter;
import borrowBooks.repository.RenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RenterServiceImpl implements RenterService {
    @Autowired
    private  RenterRepository renterRepository;

    @Override
    public List<Renter> findAll() {
        return renterRepository.findAll();
    }
}
