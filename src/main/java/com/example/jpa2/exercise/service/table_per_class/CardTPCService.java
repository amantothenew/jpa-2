package com.example.jpa2.exercise.service.table_per_class;

import com.example.jpa2.exercise.entity.single_table.Card;
import com.example.jpa2.exercise.entity.table_per_class.CardTPC;
import com.example.jpa2.exercise.repository.CardRepo;
import com.example.jpa2.exercise.repository.table_per_class.CardTPCRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CardTPCService {
        private final CardTPCRepo repo;

        public List<CardTPC> saveAll(List<CardTPC> cardPayments) {
            return repo.saveAll(cardPayments);
        }
}