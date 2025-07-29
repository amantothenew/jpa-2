package com.example.jpa2.exercise.repository.joined;

import com.example.jpa2.exercise.entity.joined.CardJ;
import com.example.jpa2.exercise.entity.table_per_class.CardTPC;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardJRepo extends JpaRepository<CardJ, Long> {

}

