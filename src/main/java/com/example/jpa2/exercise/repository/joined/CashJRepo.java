package com.example.jpa2.exercise.repository.joined;

import com.example.jpa2.exercise.entity.joined.CashJ;
import com.example.jpa2.exercise.entity.table_per_class.CashTPC;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CashJRepo extends JpaRepository<CashJ, Long> {
}
