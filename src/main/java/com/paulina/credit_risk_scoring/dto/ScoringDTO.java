package com.paulina.credit_risk_scoring.dto;

import com.paulina.credit_risk_scoring.rest.enums.RiskLevel;
import jakarta.persistence.Enumerated;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ScoringDTO {

    Double score;

    @Enumerated
    RiskLevel riskLevel;
}
