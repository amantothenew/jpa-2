package com.example.jpa2.exercise.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
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
}
