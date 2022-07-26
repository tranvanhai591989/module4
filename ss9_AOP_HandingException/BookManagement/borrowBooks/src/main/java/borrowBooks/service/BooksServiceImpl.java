package borrowBooks.service;

import borrowBooks.model.Books;
import borrowBooks.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksServiceImpl implements BooksService {
    @Autowired
    private BooksRepository booksRepository;

    @Override
    public List<Books> findAll() {
        return booksRepository.findAll();
    }

    @Override
    public void save(Books books) {
        booksRepository.save(books);
    }

    @Override
    public Books findById(Integer id) {
        return booksRepository.findById(id).get();
    }
}
