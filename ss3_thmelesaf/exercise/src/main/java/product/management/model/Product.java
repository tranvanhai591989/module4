package product.management.model;

public class Product {
    private int id;
    private String name;
    private double price;
    private int moment;
    private String detail;
    private String producer;

    public Product() {
    }

    public Product(int id, String name, double price, int moment, String detail, String producer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.moment = moment;
        this.detail = detail;
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMoment() {
        return moment;
    }

    public void setMoment(int moment) {
        this.moment = moment;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
