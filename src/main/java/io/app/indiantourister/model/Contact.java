package io.app.indiantourister.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;

    private Long mobile;
    private String email;
    @ManyToOne()
    Customer customer;
}
