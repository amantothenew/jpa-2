package com.example.jpa2.exercise.service.joined;

import com.example.jpa2.exercise.entity.joined.CardJ;
import com.example.jpa2.exercise.repository.joined.CardJRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CardJService {
        private final CardJRepo repo;

        public List<CardJ> saveAll(List<CardJ> cardPayments) {
            return repo.saveAll(cardPayments);
        }
}