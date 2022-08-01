package borrowBooks.service;

import borrowBooks.model.Book;

import java.util.List;

public interface BooksService {
    List<Book> findAll();

    void save(Book book);

    Book findById(Integer id);

}
