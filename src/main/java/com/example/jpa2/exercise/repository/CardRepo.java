package com.example.jpa2.exercise.repository;

import com.example.jpa2.exercise.entity.single_table.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepo extends JpaRepository<Card, Long> {
}
