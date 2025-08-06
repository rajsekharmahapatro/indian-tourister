package io.app.indiantourister.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "user_id")
    Customer customer;
}
