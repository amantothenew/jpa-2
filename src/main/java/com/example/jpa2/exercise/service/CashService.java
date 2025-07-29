package com.example.jpa2.exercise.service;

import com.example.jpa2.exercise.entity.single_table.Cash;
import com.example.jpa2.exercise.repository.CashRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CashService {

    private final CashRepo repo;

    public List<Cash> saveAll(List<Cash> cashPayments) {
        return repo.saveAll(cashPayments);
    }
}
