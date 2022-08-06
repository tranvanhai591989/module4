package com.example.demo.model.user;

import com.example.demo.model.employee.Employee;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {
    @Id
    private String username;
    private String password;

    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private Set<Employee> employees;

    @ManyToMany(mappedBy = "users", fetch = FetchType.EAGER)
    private Set<Role> roles;

    public User() {
    }

    public User(String username, String password, Set<Employee> employees, Set<Role> roles) {
        this.username = username;
        this.password = password;
        this.employees = employees;
        this.roles = roles;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String userName) {
        this.username = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}