package borrowBooks.model;

import javax.persistence.*;

@Entity

public class Renter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int renterId;
    private  String renterName;
    private  String renterCode;
    @ManyToOne
    @JoinColumn(name ="bookId",referencedColumnName = "bookID")
    private Books book;

    public Renter() {
    }

    public Renter(int renterId, String renterName, String renterCode, Books book) {
        this.renterId = renterId;
        this.renterName = renterName;
        this.renterCode = renterCode;
        this.book = book;
    }

    public int getRenterId() {
        return renterId;
    }

    public void setRenterId(int renterId) {
        this.renterId = renterId;
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
        return book;
    }

    public void setBook(Books book) {
        this.book = book;
    }
}
