package borrowbook.borrow_books.service;

import java.util.List;

import borrowbook.borrow_books.common.Constants;
import borrowbook.borrow_books.model.Book;
import borrowbook.borrow_books.model.IssuedBook;
import borrowbook.borrow_books.repository.IssuedBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class IssuedBookService {

    @Autowired
    private IssuedBookRepository issuedBookRepository;

    public List<IssuedBook> getAll() {
        return issuedBookRepository.findAll();
    }

    public IssuedBook get(Long id) {
        return issuedBookRepository.findById(id).get();
    }

    public Long getCountByBook(Book book) {
        return issuedBookRepository.countByBookAndReturned(book, Constants.BOOK_NOT_RETURNED);
    }

    public IssuedBook save(IssuedBook issuedBook) {
        return issuedBookRepository.save(issuedBook);
    }

    public IssuedBook addNew(IssuedBook issuedBook) {
        issuedBook.setReturned( Constants.BOOK_NOT_RETURNED );
        return issuedBookRepository.save(issuedBook);
    }

}
