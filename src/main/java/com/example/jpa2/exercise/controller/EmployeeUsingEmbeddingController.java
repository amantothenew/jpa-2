package com.example.jpa2.exercise.controller;


import com.example.jpa2.exercise.entity.Employee;
import com.example.jpa2.exercise.entity.table_per_class.EmployeeUsingEmbedding;
import com.example.jpa2.exercise.service.EmployeeUsingEmbeddingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
@RequiredArgsConstructor
public class EmployeeUsingEmbeddingController {

    private final EmployeeUsingEmbeddingService service;

    @PostMapping
    public EmployeeUsingEmbedding create(@RequestBody EmployeeUsingEmbedding employee) {
        return service.save(employee);
    }

    @GetMapping
    public List<EmployeeUsingEmbedding> fetchAll() {
        return service.getAll();
    }
}
