package borrowBooks.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Renter {
    @Id
    private String renterCode;

    private String renterName;
    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "book_id")
    private Books books;

    public Renter() {
    }

    public Renter(String renterName, String renterCode, Books book) {
        this.renterName = renterName;
        this.renterCode = renterCode;
        this.books = books;
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

    public Books getBook() {
        return books;
    }

    public void setBook(Books book) {
        this.books = book;
    }
}
