package com.example.jpa2.exercise.service;

import com.example.jpa2.exercise.entity.single_table.Card;
import com.example.jpa2.exercise.repository.CardRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CardService {
        private final CardRepo repo;

        public List<Card> saveAll(List<Card> cardPayments) {
            return repo.saveAll(cardPayments);
        }
}