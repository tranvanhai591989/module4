package borrowBooks.service;

import borrowBooks.model.Book;
import borrowBooks.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksServiceImpl implements BooksService {
    @Autowired
    private BooksRepository booksRepository;

    @Override
    public List<Book> findAll() {
        return booksRepository.findAll();
    }

    @Override
    public void save(Book book) {
        booksRepository.save(book);
    }

    @Override
    public Book findById(Integer id) {
        return booksRepository.findById(id).get();
    }
}
