package exchangeRealty.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    Set<Exchange> exchanges;
    private String customerCode;
    private String customerName;
    private String customerPhone;
    private String customerEmail;

    public Customer() {
    }

    public Customer(Integer customerId, Set<Exchange> exchanges, String customerCode, String customerName, String customerPhone, String customerEmail) {
        this.customerId = customerId;
        this.exchanges = exchanges;
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.customerEmail = customerEmail;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Set<Exchange> getExchanges() {
        return exchanges;
    }

    public void setExchanges(Set<Exchange> exchanges) {
        this.exchanges = exchanges;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
}
