package borrowBooks.service;

import borrowBooks.model.Renter;

public interface RenterService {
    void save(Renter renter);

    Renter findByCode(String code);

    void delete(Renter renter);


}
