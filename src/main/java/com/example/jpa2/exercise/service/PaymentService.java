package com.example.jpa2.exercise.service;

import com.example.jpa2.exercise.entity.single_table.Payment;
import com.example.jpa2.exercise.repository.PaymentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    private final PaymentRepo repo;

    public PaymentService (PaymentRepo repo) {
        this.repo = repo;
    }

    public List<Payment> saveCardPayment(List<Payment> payments) {
        return repo.saveAll(payments);
    }

    public List<Payment> getAll() {
        return repo.findAll();
    }
}
