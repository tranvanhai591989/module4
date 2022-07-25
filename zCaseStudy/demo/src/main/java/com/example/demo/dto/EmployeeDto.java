package com.example.demo.dto;

import java.util.Date;

public class EmployeeDto {
    private int employeeId;
    private String employeeName;
    private Date employeeBirth;
    private String employeeIdCard;
    private double employeeSalary;
    private String employeePhoneNumber;
    private String employeeEmail;
    private String employeeAddress;
    private String position;
    private String educationDegree;
    private String division;
    private String users;
    private String contracts;

    public EmployeeDto() {
    }

    public EmployeeDto(int employeeId, String employeeName, Date employeeBirth, String employeeIdCard, double employeeSalary, String employeePhoneNumber, String employeeEmail, String employeeAddress, String position, String educationDegree, String division, String users, String contracts) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeBirth = employeeBirth;
        this.employeeIdCard = employeeIdCard;
        this.employeeSalary = employeeSalary;
        this.employeePhoneNumber = employeePhoneNumber;
        this.employeeEmail = employeeEmail;
        this.employeeAddress = employeeAddress;
        this.position = position;
        this.educationDegree = educationDegree;
        this.division = division;
        this.users = users;
        this.contracts = contracts;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Date getEmployeeBirth() {
        return employeeBirth;
    }

    public void setEmployeeBirth(Date employeeBirth) {
        this.employeeBirth = employeeBirth;
    }

    public String getEmployeeIdCard() {
        return employeeIdCard;
    }

    public void setEmployeeIdCard(String employeeIdCard) {
        this.employeeIdCard = employeeIdCard;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeePhoneNumber() {
        return employeePhoneNumber;
    }

    public void setEmployeePhoneNumber(String employeePhoneNumber) {
        this.employeePhoneNumber = employeePhoneNumber;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(String educationDegree) {
        this.educationDegree = educationDegree;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public String getContracts() {
        return contracts;
    }

    public void setContracts(String contracts) {
        this.contracts = contracts;
    }
}
