package com.example.jpa2.exercise.repository.table_per_class;

import com.example.jpa2.exercise.entity.table_per_class.CardTPC;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardTPCRepo extends JpaRepository<CardTPC, Long> {}

