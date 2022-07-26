package borrowBooks.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;
    private String bookName;
    private String author;
    private int amount;
    @OneToMany(mappedBy = "book")
    private Set<Renter> renters;

    public Books() {
    }

    public Books(int bookId, String bookName, String author, int amount, Set<Renter> renters) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.amount = amount;
        this.renters = renters;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Set<Renter> getRenters() {
        return renters;
    }

    public void setRenters(Set<Renter> renters) {
        this.renters = renters;
    }
}
