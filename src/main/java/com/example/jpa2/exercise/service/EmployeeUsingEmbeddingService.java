package com.example.jpa2.exercise.service;
import com.example.jpa2.exercise.entity.table_per_class.EmployeeUsingEmbedding;
import com.example.jpa2.exercise.repository.EmployeeUsingEmbeddingRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class EmployeeUsingEmbeddingService {
    private final EmployeeUsingEmbeddingRepo repo;

    public EmployeeUsingEmbedding save(EmployeeUsingEmbedding emp) {
        return repo.save(emp);
    }

    public List<EmployeeUsingEmbedding> getAll() {
        return repo.findAll();
    }
}
