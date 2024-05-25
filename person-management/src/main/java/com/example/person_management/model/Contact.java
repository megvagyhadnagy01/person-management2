package com.example.person_management.model;

import jakarta.persistence.*;
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

        private String type;
        private String value;
}
