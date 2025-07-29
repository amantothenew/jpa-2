package com.example.jpa2.exercise.entity.table_per_class;

import com.example.jpa2.exercise.entity.Salary;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class EmployeeUsingEmbedding {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private Integer age;

    @Embedded
    private Salary salary;
}
