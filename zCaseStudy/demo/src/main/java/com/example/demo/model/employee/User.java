package com.example.demo.model.employee;

import com.example.demo.model.employee.Employee;
import com.example.demo.model.employee.Role;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {
    @Id
    private  String userName;
    private  String password;
    @ManyToMany(mappedBy = "users")
    private Set<Role> roles;
    @OneToMany(mappedBy = "users",cascade = CascadeType.ALL)
    private Set<Employee> employees;

    public User() {
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public User(String userName, String password, Set<Role> role, Set<Employee> employees) {
        this.userName = userName;
        this.password = password;
        this.roles = role;
        this.employees = employees;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRole() {
        return roles;
    }

    public void setRole(Set<Role> role) {
        this.roles = role;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
