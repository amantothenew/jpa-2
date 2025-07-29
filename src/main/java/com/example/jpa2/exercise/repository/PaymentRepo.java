package com.example.jpa2.exercise.repository;

import com.example.jpa2.exercise.entity.single_table.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<Payment, Long> {
}
