package com.example.jpa2.exercise.controller.table_per_class;

import com.example.jpa2.exercise.entity.single_table.Cash;
import com.example.jpa2.exercise.entity.table_per_class.CashTPC;
import com.example.jpa2.exercise.service.CashService;
import com.example.jpa2.exercise.service.table_per_class.CashTPCService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/cash-tpc-payments")
public class CashTPCController {

    private final CashTPCService service;

    @PostMapping
    public List<CashTPC> saveAll(@RequestBody List<CashTPC> cashPayments) {
        return service.saveAll(cashPayments);
    }
}
