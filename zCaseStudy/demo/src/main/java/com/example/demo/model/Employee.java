package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private int employeeId;
    private String employeeName;
    private Date employeeBirth;
    private String employeeIdCard;
    private double employeeSalary;
    private String employeePhoneNumber;
    private String employeeEmail;
    private String employeeAddress;
    @ManyToOne
    @JoinColumn(name = "positionId",referencedColumnName = "positionId")
    private Position position;
    @ManyToOne
    @JoinColumn(name = "educationDegreeId")
    private EducationDegree educationDegree;
    @ManyToOne
    @JoinColumn(name = "divisionId")
    private Division division;
    private String userName;






}
