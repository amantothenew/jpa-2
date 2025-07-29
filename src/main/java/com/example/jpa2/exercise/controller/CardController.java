package com.example.jpa2.exercise.controller;

import com.example.jpa2.exercise.entity.single_table.Card;
import com.example.jpa2.exercise.service.CardService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/card-payments")
public class CardController {

    private final CardService cardRepo;

    @PostMapping
    public List<Card> saveCards(@RequestBody List<Card> cards) {
        return cardRepo.saveAll(cards);
    }

    @GetMapping
    public List<Card> getAllCards(@RequestBody List<Card> cardPayments) {
        return cardRepo.saveAll(cardPayments);
    }
}


