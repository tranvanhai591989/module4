package com.example.demo.dto;

import com.example.demo.model.customer.Customer;
import com.example.demo.model.employee.Employee;
import com.example.demo.model.facility.Facility;

import java.util.Date;

public class TotalMoneyDto {
    private int contractId;
    private Date startDate;
    private Date endDate;
    private double deposit;
    private Employee employee;
    private Customer customer;
    private Facility facility;
    private double total;

    public TotalMoneyDto() {
    }

    public TotalMoneyDto(int contractId, Date startDate, Date endDate, double deposit, Employee employee, Customer customer, Facility facility, double total) {
        this.contractId = contractId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.deposit = deposit;
        this.employee = employee;
        this.customer = customer;
        this.facility = facility;
        this.total = total;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
