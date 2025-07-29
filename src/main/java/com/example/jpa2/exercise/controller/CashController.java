package com.example.jpa2.exercise.controller;

import com.example.jpa2.exercise.entity.single_table.Cash;
import com.example.jpa2.exercise.service.CashService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/cash-payments")
public class CashController {

    private final CashService service;

    @PostMapping
    public List<Cash> saveAll(@RequestBody List<Cash> cashPayments) {
        return service.saveAll(cashPayments);
    }
}
