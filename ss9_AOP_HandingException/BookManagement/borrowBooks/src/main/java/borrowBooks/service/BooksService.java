package borrowBooks.service;

import borrowBooks.model.Books;

import java.util.List;

public interface BooksService {
    List<Books> findAll();

    void save(Books books);

    Books findById(Integer id);

}
