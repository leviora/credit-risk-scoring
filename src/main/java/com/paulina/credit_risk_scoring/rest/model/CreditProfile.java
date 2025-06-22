package com.paulina.credit_risk_scoring.rest.model;

import com.paulina.credit_risk_scoring.rest.enums.EmploymentStatus;
import com.paulina.credit_risk_scoring.rest.enums.MaritalStatus;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreditProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id", nullable = false, unique = true)
    Client client;

    Double monthlyGrossIncome;

    @Enumerated(EnumType.STRING)
    EmploymentStatus employmentStatus;

    @Enumerated(EnumType.STRING)
    MaritalStatus maritalStatus;

    Integer numberOfDependents;

    Boolean ownsProperty;

    Boolean hasOtherLoans;

    Integer creditHistoryLengthMonths;
}
