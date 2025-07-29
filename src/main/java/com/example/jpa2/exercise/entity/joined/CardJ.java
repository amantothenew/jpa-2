package com.example.jpa2.exercise.entity.joined;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class CardJ extends PaymentJ {
    private String cardNumber;
}
