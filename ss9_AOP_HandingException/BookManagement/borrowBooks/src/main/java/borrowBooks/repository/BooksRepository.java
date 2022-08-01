package borrowBooks.repository;

import borrowBooks.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface BooksRepository extends JpaRepository<Book, Integer> {
}
