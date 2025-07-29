package com.example.jpa2.exercise.controller;

import com.example.jpa2.exercise.entity.single_table.Payment;
import com.example.jpa2.exercise.service.PaymentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class PaymentController {

    private PaymentService service;

    @GetMapping("/payments")
    public List<Payment> fetchAll() {
        return service.getAll();
    }

    @PostMapping("/payments")
    public List<Payment> saveAll(@RequestBody List<Payment> payments) {
        return service.saveCardPayment(payments);
    }

}
