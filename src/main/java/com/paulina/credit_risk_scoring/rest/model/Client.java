package com.paulina.credit_risk_scoring.rest.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    String lastName;

    @Column(unique = true)
    String personalIdNumber;

    LocalDate dateOfBirth;

    String email;

    String phoneNumber;

    String address;

    String city;

    String postalCode;

    String country;
}
