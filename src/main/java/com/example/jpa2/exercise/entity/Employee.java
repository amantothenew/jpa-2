package com.example.jpa2.exercise.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employeeTable")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empId")
    private long id;

    @Column(name = "empFirstName")
    private String firstName;

    @Column(name = "empLastName")
    private String lastName;

    @Column(name = "empSalary")
    private long salary;

    @Column(name = "empAge")
    private int age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
