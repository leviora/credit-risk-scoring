package com.paulina.credit_risk_scoring.rest.model;

import com.paulina.credit_risk_scoring.rest.enums.RiskLevel;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Scoring {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Double score;

    @Enumerated
    RiskLevel riskLevel;
}
