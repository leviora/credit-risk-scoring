package com.paulina.credit_risk_scoring.rest.service;

import com.paulina.credit_risk_scoring.rest.model.Scoring;
import java.util.List;

public interface ScoringService {
    Scoring createScoring(Scoring scoring);
    List<Scoring> getAllScorings();
    Scoring getScoringById(Long id);
    void deleteScoring(Long id);
}
