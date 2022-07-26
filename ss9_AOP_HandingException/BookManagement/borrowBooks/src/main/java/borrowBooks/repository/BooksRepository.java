package borrowBooks.repository;

import borrowBooks.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface BooksRepository extends JpaRepository<Books, Integer> {
    @Modifying
    @Query(value = "update  books  set  amount=:amount-1 where  book_id=:id", nativeQuery = true)
    void plus(@Param("amount") int amount,@Param("id") int id);

    @Modifying
    @Query(value = "update  books  set  amount=:amount+1 where  book_id=:id", nativeQuery = true)
    void negative(@Param("amount") int amount,@Param("id") int id);
}
