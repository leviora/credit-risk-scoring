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
public class LoanApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne(optional = false)
    Client client;

    @Column(nullable = false)
    Double requestedAmount;

    @Column(nullable = false)
    Integer requestedTermInMonths;

    @Column(nullable = false)
    LocalDate applicationDate;

    @OneToOne(cascade = CascadeType.ALL)
    Scoring scoring;

    @OneToOne(cascade = CascadeType.ALL)
    CreditRiskDecision creditRiskDecision;
}
