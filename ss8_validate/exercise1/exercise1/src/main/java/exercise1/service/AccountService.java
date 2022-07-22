package exercise1.service;

import exercise1.model.Account;

import java.util.List;
import java.util.Optional;

public interface AccountService {
    List<Account> findAll();

    void save(Account account);

    void delete(int id);

    Optional<Account> findById(int id);


}
