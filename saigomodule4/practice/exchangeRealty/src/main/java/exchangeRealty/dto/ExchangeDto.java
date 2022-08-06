package exchangeRealty.dto;

import exchangeRealty.model.Customer;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

public class ExchangeDto {
    private Integer exchangeId;
    @Pattern(regexp = "^[MGD-]+\\d{4}$")
    private String exchangeCode;
    private Customer customer;
    @Pattern(regexp = "^[1980-2022]+[1-8]+[1-6]")
    private String exchangeDate;
    private String exchangeType;
    @Min(5000000)
    private int price;
    @Min(30)
    private int area;

    public ExchangeDto() {
    }

    public ExchangeDto(Integer exchangeId, String exchangeCode, Customer customer, String exchangeDate, String exchangeType, int price, int area) {
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
