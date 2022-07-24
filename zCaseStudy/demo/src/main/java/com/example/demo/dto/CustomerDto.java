package com.example.demo.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

public class CustomerDto {
    private int customerId;
    private String customerType;
    private String contracts;
    @NotEmpty
    @Pattern(regexp = "^[a-zA-ZàáâäãåąčćęèéêëėįìíîïłńòóôöõøùúûüųūÿýżźñçčšžÀÁÂÄÃÅĄĆČĖĘÈÉÊËÌÍÎÏĮŁŃÒ\n" +
            "        ÓÔÖÕØÙÚÛÜŲŪŸÝŻŹÑßÇŒÆČŠŽ∂ð ,.'-]+$", message = "Wrong format")
    private String customerName;

    @Pattern(regexp = "(Date of birth:|Birthday:)\\s+(?:0[1-9]|[12][0-9]|3[01])[-/.](?:0[1-9]|1[012])[-/.](?:19\\d{2}|20[01][0-9]|2020)\\b", message = "Wrong format")
    private Date customerBirth;

    private int customerGender;

    @Pattern(regexp = "^d{9}")
    private String customerIdCard;

    @NotNull
    @Valid
    @Pattern(regexp = "^[0-9]{9}$", message = "Input 9 numbers")
    private String customerPhoneNumber;

    @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "abc@gmail.com")
    private String customerEmail;

    @Pattern(regexp = "\\d+[ ](?:[A-Za-z0-9.-]+[ ]?)+(?:Avenue|Lane|Road|Boulevard|Drive|Street|Ave|Dr|Rd|Blvd|Ln|St)\\.?", message = "Wrong format")
    private String customerAddress;

    public CustomerDto() {
    }

    public CustomerDto(int customerId, String customerType, String contracts, String customerName, Date customerBirth, int customerGender, String customerIdCard, String customerPhoneNumber, String customerEmail, String customerAddress) {
        this.customerId = customerId;
        this.customerType = customerType;
        this.contracts = contracts;
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

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getContracts() {
        return contracts;
    }

    public void setContracts(String contracts) {
        this.contracts = contracts;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getCustomerBirth() {
        return customerBirth;
    }

    public void setCustomerBirth(Date customerBirth) {
        this.customerBirth = customerBirth;
    }

    public int getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(int customerGender) {
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
