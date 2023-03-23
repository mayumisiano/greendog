package com.greendog.delivery.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = true)
    private Client client;

    @ManyToMany
    @Cascade(CascadeType.MERGE)
    private List<Item> items;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date date;

    @Min(1)
    private Double totalPrice;
}
