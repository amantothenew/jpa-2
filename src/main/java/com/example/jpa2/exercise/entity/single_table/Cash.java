package com.example.jpa2.exercise.entity.single_table;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
@DiscriminatorValue("ch")
public class Cash extends Payment{
    private boolean isPaymentDone;
}
