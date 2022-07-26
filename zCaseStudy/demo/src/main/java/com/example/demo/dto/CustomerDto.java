package com.example.demo.dto;

import com.example.demo.model.customer.CustomerType;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class CustomerDto {
    private int customerId;
    private CustomerType customerType;
//    private Set<Contract> contracts;
    @NotEmpty
    @Pattern(regexp = "^[a-zA-ZàáâäãåąčćęèéêëėįìíîïłńòóôöõøùúûüųūÿýżźñçčšžÀÁÂÄÃÅĄĆČĖĘÈÉÊËÌÍÎÏĮŁŃÒ\n" +
            "        ÓÔÖÕØÙÚÛÜŲŪŸÝŻŹÑßÇŒÆČŠŽ∂ð ,.'-]+$", message = "Wrong format")
    private String customerName;

    //    @Pattern(regexp = "(Date of birth:|Birthday:)\\s+(?:0[1-9]|[12][0-9]|3[01])[-/.](?:0[1-9]|1[012])[-/.](?:19\\d{2}|20[01][0-9]|2020)\\b", message = "Wrong format")
    private String customerBirth;

    private String customerGender;

    @Pattern(regexp = "^[0-9]{9}")
    private String customerIdCard;

    @NotNull
    @Valid
    @Pattern(regexp = "^[0-9]{9}$", message = "Input 9 numbers")
    private String customerPhoneNumber;

    @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "abc@gmail.com")
    private String customerEmail;
    @NotEmpty
//    @Pattern(regexp = "[A-Za-z0-9'\\.\\-\\s\\,]", message = "Wrong format")
    private String customerAddress;

    public CustomerDto() {
    }

    public CustomerDto(int customerId, CustomerType customerType, String customerName, String customerBirth, String customerGender, String customerIdCard, String customerPhoneNumber, String customerEmail, String customerAddress) {
        this.customerId = customerId;
        this.customerType = customerType;

        this.customerName = customerName;
        this.customerBirth = customerBirth;
        this.customerGender = customerGender;
        this.customerIdCard = customerIdCard;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
    }

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

//    public Set<Contract> getContracts() {
//        return contracts;
//    }

//    public void setContracts(Set<Contract> contracts) {
//        this.contracts = contracts;
//    }

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
