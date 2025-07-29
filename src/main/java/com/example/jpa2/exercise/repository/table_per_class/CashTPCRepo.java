package com.example.jpa2.exercise.repository.table_per_class;

import com.example.jpa2.exercise.entity.table_per_class.CashTPC;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CashTPCRepo extends JpaRepository<CashTPC, Long> {
}
