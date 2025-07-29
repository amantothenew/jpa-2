package com.example.jpa2.exercise.service.table_per_class;

import com.example.jpa2.exercise.entity.single_table.Cash;
import com.example.jpa2.exercise.entity.table_per_class.CashTPC;
import com.example.jpa2.exercise.repository.CashRepo;
import com.example.jpa2.exercise.repository.table_per_class.CashTPCRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CashTPCService {

    private final CashTPCRepo repo;

    public List<CashTPC> saveAll(List<CashTPC> cashPayments) {
        return repo.saveAll(cashPayments);
    }
}
