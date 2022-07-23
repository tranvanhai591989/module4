package exercise1.repository;


import exercise1.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;


@Transactional
public interface AccountRepository extends JpaRepository<Account, Integer> {

}
