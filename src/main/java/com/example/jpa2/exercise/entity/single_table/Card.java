package com.example.jpa2.exercise.entity.single_table;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
@DiscriminatorValue("cc")
public class Card extends Payment{
    private String cardNumber;
}
