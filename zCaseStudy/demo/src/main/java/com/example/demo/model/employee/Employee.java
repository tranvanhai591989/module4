package com.example.demo.model.employee;

import com.example.demo.model.contract.Contract;
import com.example.demo.model.user.User;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;
    private String employeeName;
    private String employeeBirth;
    @Column(unique = true)
    private String employeeIdCard;
    private double employeeSalary;
    @Column(unique = true)
    private String employeePhoneNumber;
    @Column(unique = true)
    private String employeeEmail;
    private String employeeAddress;
    @ManyToOne
    @JoinColumn(name = "positionId", referencedColumnName = "positionId")
    private Position position;
    @ManyToOne
    @JoinColumn(name = "educationDegreeId", referencedColumnName = "educationDegreeId")
    private EducationDegree educationDegree;
    @ManyToOne
    @JoinColumn(name = "divisionId", referencedColumnName = "divisionId")
    private Division division;
    @ManyToOne
    @JoinColumn(name = "userName", referencedColumnName = "userName")
    private User users;
    @OneToMany(mappedBy = "employee")
    private Set<Contract> contracts;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, String employeeBirth, String employeeIdCard, double employeeSalary, String employeePhoneNumber, String employeeEmail, String employeeAddress, Position position, EducationDegree educationDegree, Division division,
                    User users,
                    Set<Contract> contracts) {
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

    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }
}
