package borrowBooks.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;
    private String bookName;
    private String author;
    private int amount;
    @OneToMany(mappedBy = "renterId")
    private List<Renter> renter;

    public Books() {
    }

    public Books(int bookId, String bookName, String author, int amount, List<Renter> renter) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.amount = amount;
        this.renter = renter;
    }
    public Books(int bookId, String bookName, String author, int amount) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.amount = amount;
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

    public List<Renter> getRenter() {
        return renter;
    }

    public void setRenter(List<Renter> renter) {
        this.renter = renter;
    }
}
