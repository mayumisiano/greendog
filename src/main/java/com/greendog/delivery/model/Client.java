package com.greendog.delivery.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.validator.constraints.Length;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Length(min=2, max=30, message="The number size must be between {min} and {max}!"
    )
    private String name;

    @NotNull
    @Length(min=2, max=300, message="The size must be between {min} and {max}!"
    )
    private String address;

    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
    @Cascade(CascadeType.ALL)
    private List<Order> orders;

}
