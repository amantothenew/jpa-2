package com.example.jpa2.exercise.controller.joined;

import com.example.jpa2.exercise.entity.joined.CashJ;
import com.example.jpa2.exercise.entity.table_per_class.CashTPC;
import com.example.jpa2.exercise.service.joined.CashJService;
import com.example.jpa2.exercise.service.table_per_class.CashTPCService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/cash-j-payments")
public class CashJController {

    private final CashJService service;

    @PostMapping
    public List<CashJ> saveAll(@RequestBody List<CashJ> cashPayments) {
        return service.saveAll(cashPayments);
    }
}
