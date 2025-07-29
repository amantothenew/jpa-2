package com.example.jpa2.exercise.repository;

import com.example.jpa2.exercise.entity.single_table.Cash;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CashRepo extends JpaRepository<Cash, Long> {
}
