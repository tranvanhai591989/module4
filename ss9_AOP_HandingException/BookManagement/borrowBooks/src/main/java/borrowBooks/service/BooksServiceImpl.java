package borrowBooks.service;

import borrowBooks.model.Books;
import borrowBooks.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BooksServiceImpl implements BooksService {
    @Autowired
    private BooksRepository booksRepository;

    @Override
    public List<Books> findAll() {
        return booksRepository.findAll();
    }

    @Override
    public Optional<Books> findById(int id) {
        return booksRepository.findById(id);
    }

    @Override
    public void save(Books books) {
        booksRepository.save(books);
    }

    @Override
    public Object plus(int amount,int id) {
        Optional<Books> book = booksRepository.findById(id);
        book.get().setAmount(book.get().getAmount() + 1);
        booksRepository.plus(amount,id);
        return null;
    }

    @Override
    public Object negative(int amount,int id) {
        Optional<Books> book = booksRepository.findById(id);
        book.get().setAmount(book.get().getAmount() - 1);
        booksRepository.negative(amount,id);
        return null;
    }
}
