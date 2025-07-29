package com.example.jpa2.exercise.entity.table_per_class;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class CardTPC extends PaymentTPC {
    private String cardNumber;
}
