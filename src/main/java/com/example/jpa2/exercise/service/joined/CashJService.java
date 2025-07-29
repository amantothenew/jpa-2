package com.example.jpa2.exercise.service.joined;

import com.example.jpa2.exercise.entity.joined.CashJ;
import com.example.jpa2.exercise.entity.table_per_class.CashTPC;
import com.example.jpa2.exercise.repository.joined.CashJRepo;
import com.example.jpa2.exercise.repository.table_per_class.CashTPCRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CashJService {

    private final CashJRepo repo;

    public List<CashJ> saveAll(List<CashJ> cashPayments) {
        return repo.saveAll(cashPayments);
    }
}
