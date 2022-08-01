package borrowBooks.model;

import javax.persistence.*;

@Entity
public class Renter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String renterCode;

    private String renterName;
    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "bookId")
    private Book book;

    public Renter() {
    }

    public Renter(Integer id, String renterCode, String renterName, Book book) {
        this.id = id;
        this.renterCode = renterCode;
        this.renterName = renterName;
        this.book = book;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRenterName() {
        return renterName;
    }

    public void setRenterName(String renterName) {
        this.renterName = renterName;
    }

    public String getRenterCode() {
        return renterCode;
    }

    public void setRenterCode(String renterCode) {
        this.renterCode = renterCode;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
