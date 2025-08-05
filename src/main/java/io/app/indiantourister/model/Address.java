package io.app.indiantourister.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;

    private String street1;
    private String street2;
    private String cityName;
    private String stateName;
    @ManyToOne
    private Customer customer;
}
