package com.example.demo.dto;

import com.example.demo.model.employee.Division;
import com.example.demo.model.employee.EducationDegree;
import com.example.demo.model.employee.Position;
import com.example.demo.model.user.User;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class EmployeeDto implements Validator {
    private int employeeId;
    @NotEmpty
    @Pattern(regexp = "^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$", message = "Wrong format")
    private String employeeName;

    private String employeeBirth;
    @Pattern(regexp = "^[0-9]{9}$", message = "Has 9 Numbers")
    private String employeeIdCard;
    private double employeeSalary;
    @NotNull
    @Valid
    @Pattern(regexp = "^(((\\+|)84)|0)(3|5|7|8|9)+([0-9]{8})$", message = "Input 9 numbers")
    private String employeePhoneNumber;
    @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "abc@gmail.com")
    private String employeeEmail;
    private String employeeAddress;
    private Position position;
    private EducationDegree educationDegree;
    private Division division;
    private User users;
    private String contracts;

    public EmployeeDto() {
    }

    public EmployeeDto(int employeeId,
                       String employeeName,
                       String employeeBirth,
                       String employeeIdCard,
                       double employeeSalary,
                       String employeePhoneNumber,
                       String employeeEmail,
                       String employeeAddress,
                       Position position,
                       EducationDegree educationDegree,
                       Division division,
                       User users, String contracts) {
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

    public String getEmployeeBirth() {
        return employeeBirth;
    }

    public void setEmployeeBirth(String employeeBirth) {
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

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public User getUsers() {
        return users;
    }

    public void setUsers(User users) {
        this.users = users;
    }

    public String getContracts() {
        return contracts;
    }

    public void setContracts(String contracts) {
        this.contracts = contracts;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
