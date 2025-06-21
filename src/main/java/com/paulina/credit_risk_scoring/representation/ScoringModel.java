package com.paulina.credit_risk_scoring.representation;

import com.paulina.credit_risk_scoring.rest.enums.RiskLevel;
import jakarta.persistence.Enumerated;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.hateoas.RepresentationModel;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ScoringModel extends RepresentationModel<ScoringModel> {

    Double score;

    @Enumerated
    RiskLevel riskLevel;
}
