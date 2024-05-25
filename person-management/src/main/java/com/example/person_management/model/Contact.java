package com.example.person_management.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @NotBlank(message = "Type is mandatory")
    private String type;

    @NotBlank(message = "Value is mandatory")
    private String value;
}
