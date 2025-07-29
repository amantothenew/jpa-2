package com.example.jpa2.exercise.controller.joined;

import com.example.jpa2.exercise.entity.joined.CardJ;
import com.example.jpa2.exercise.entity.table_per_class.CardTPC;
import com.example.jpa2.exercise.service.joined.CardJService;
import com.example.jpa2.exercise.service.table_per_class.CardTPCService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/card-j-payments")
public class CardJController {

    private final CardJService cardRepo;

    @PostMapping
    public List<CardJ> saveCardTPCs(@RequestBody List<CardJ> cards) {
        return cardRepo.saveAll(cards);
    }

}


