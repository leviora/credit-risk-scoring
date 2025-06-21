package com.paulina.credit_risk_scoring.mapper;

import com.paulina.credit_risk_scoring.dto.ScoringDTO;
import com.paulina.credit_risk_scoring.representation.ScoringModel;
import com.paulina.credit_risk_scoring.rest.model.Scoring;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ScoringMapper {

    ScoringDTO toDTO(Scoring scoring);
    Scoring toEntity(ScoringDTO scoringDTO);

    ScoringModel toModel(Scoring scoring);
}
