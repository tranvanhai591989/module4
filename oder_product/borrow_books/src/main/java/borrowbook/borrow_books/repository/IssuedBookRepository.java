package borrowbook.borrow_books.repository;

import borrowbook.borrow_books.model.Book;
import borrowbook.borrow_books.model.IssuedBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssuedBookRepository extends JpaRepository<IssuedBook, Long> {
    public Long countByBookAndReturned(Book book, Integer returned);
}