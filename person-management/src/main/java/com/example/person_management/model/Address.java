package com.example.person_management.model;



import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    private String type;
    private String address;

    @OneToMany(mappedBy = "address", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Contact> contacts;
}
