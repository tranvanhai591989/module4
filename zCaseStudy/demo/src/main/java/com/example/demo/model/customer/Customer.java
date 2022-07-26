package com.example.demo.model.customer;

import javax.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;
    @ManyToOne
    @JoinColumn(name = "customerTypeId", referencedColumnName = "customerTypeId")
    private CustomerType customerType;
//    @OneToMany(mappedBy = "customer")
//    private Set<Contract> contracts;
    private String customerName;
    private String customerBirth;
    private String customerGender;
    private String customerIdCard;
    private String customerPhoneNumber;
    private String customerEmail;
    private String customerAddress;

    public Customer() {
    }

//    public Set<Contract> getContracts() {
//        return contracts;
//    }
//
//    public void setContracts(Set<Contract> contracts) {
//        this.contracts = contracts;
//    }
    public Customer(int customerId, CustomerType customerType, String customerName, String customerBirth, String customerGender, String customerIdCard, String customerPhoneNumber, String customerEmail, String customerAddress) {
        this.customerId = customerId;
        this.customerType = customerType;
//        this.contracts = contracts;
        this.customerName = customerName;
        this.customerBirth = customerBirth;
        this.customerGender = customerGender;
        this.customerIdCard = customerIdCard;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
    }
//    public Customer(int customerId, CustomerType customerType, String customerName, String customerBirth, String customerGender, String customerIdCard, String customerPhoneNumber, String customerEmail, String customerAddress) {
//        this.customerId = customerId;
//        this.customerType = customerType;
//        this.customerName = customerName;
//        this.customerBirth = customerBirth;
//        this.customerGender = customerGender;
//        this.customerIdCard = customerIdCard;
//        this.customerPhoneNumber = customerPhoneNumber;
//        this.customerEmail = customerEmail;
//        this.customerAddress = customerAddress;
//    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerBirth() {
        return customerBirth;
    }

    public void setCustomerBirth(String customerBirth) {
        this.customerBirth = customerBirth;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public String getCustomerIdCard() {
        return customerIdCard;
    }

    public void setCustomerIdCard(String customerIdCard) {
        this.customerIdCard = customerIdCard;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
}
