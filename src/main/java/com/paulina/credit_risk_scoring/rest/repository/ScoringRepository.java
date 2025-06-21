package com.paulina.credit_risk_scoring.rest.repository;

import com.paulina.credit_risk_scoring.rest.model.Scoring;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoringRepository extends JpaRepository<Scoring, Long> {
}
