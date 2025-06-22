package com.paulina.credit_risk_scoring.dto;

import com.paulina.credit_risk_scoring.rest.enums.RiskLevel;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ScoringDTO {

    @NotNull(message = "Score is mandatory")
    @DecimalMin(value = "0.0", message = "Score must be at least 0")
    Double score;


    @NotNull(message = "Risk level is mandatory")
    RiskLevel riskLevel;
}

