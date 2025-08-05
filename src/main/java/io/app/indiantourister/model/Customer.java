package io.app.indiantourister.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "CUSTOMER")
@Data
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;

    private String firstName;
    private String lastName;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private Set<Address> address;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private Set<Contact> contact;

}
