package com.example.jpa2.exercise.controller.table_per_class;

import com.example.jpa2.exercise.entity.single_table.Card;
import com.example.jpa2.exercise.entity.table_per_class.CardTPC;
import com.example.jpa2.exercise.service.CardService;
import com.example.jpa2.exercise.service.table_per_class.CardTPCService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/card-tpc-payments")
public class CardTPCController {

    private final CardTPCService cardRepo;

    @PostMapping
    public List<CardTPC> saveCardTPCs(@RequestBody List<CardTPC> cards) {
        return cardRepo.saveAll(cards);
    }

    @GetMapping
    public List<CardTPC> getAllCardTPCs(@RequestBody List<CardTPC> cardPayments) {
        return cardRepo.saveAll(cardPayments);
    }
}


