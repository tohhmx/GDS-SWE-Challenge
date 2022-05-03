package com.example.mingxuan.gds.swe.challenge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "salary")
    private double salary;
    public User() {
    }
    public User(long id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + '}';
    }
}
