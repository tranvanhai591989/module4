package exchangeRealty.model;

import javax.persistence.*;

@Entity
public class Exchange {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer exchangeId;
    private String exchangeCode;
    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customerId")
    private Customer customer;
    private String exchangeDate;
    private String exchangeType;
    private int price;
    private int area;


    public Exchange() {
    }

    public Exchange(Integer exchangeId, String exchangeCode, Customer customer, String exchangeDate, String exchangeType, int price, int area) {
        this.exchangeId = exchangeId;
        this.exchangeCode = exchangeCode;
        this.customer = customer;
        this.exchangeDate = exchangeDate;
        this.exchangeType = exchangeType;
        this.price = price;
        this.area = area;
    }

    public Integer getExchangeId() {
        return exchangeId;
    }

    public void setExchangeId(Integer exchangeId) {
        this.exchangeId = exchangeId;
    }

    public String getExchangeCode() {
        return exchangeCode;
    }

    public void setExchangeCode(String exchangeCode) {
        this.exchangeCode = exchangeCode;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getExchangeDate() {
        return exchangeDate;
    }

    public void setExchangeDate(String exchangeDate) {
        this.exchangeDate = exchangeDate;
    }

    public String getExchangeType() {
        return exchangeType;
    }

    public void setExchangeType(String exchangeType) {
        this.exchangeType = exchangeType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
