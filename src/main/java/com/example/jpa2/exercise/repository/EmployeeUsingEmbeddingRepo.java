package com.example.jpa2.exercise.repository;

import com.example.jpa2.exercise.entity.table_per_class.EmployeeUsingEmbedding;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeUsingEmbeddingRepo extends JpaRepository<EmployeeUsingEmbedding, Long> {
}
