package borrowBooks.service;

import borrowBooks.model.Books;

import java.util.List;
import java.util.Optional;

public interface BooksService {
    List<Books> findAll();
    Optional<Books> findById(int id);

    void save(Books books);

    Object plus(int amount,int id);

    Object negative(int amount,int id);
}
