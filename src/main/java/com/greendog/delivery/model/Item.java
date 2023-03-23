package com.greendog.delivery.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import org.hibernate.validator.constraints.Length;
import org.jetbrains.annotations.NotNull;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Length(min=2, max=30, message="The name size must be between {min} and {max} characters")
    private String name;

    @NotNull
    @Min(value = 20, message = "The min price value must be at least $20")
    private Double price;
}
