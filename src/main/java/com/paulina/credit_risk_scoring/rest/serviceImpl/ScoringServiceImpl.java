package com.paulina.credit_risk_scoring.rest.serviceImpl;

import com.paulina.credit_risk_scoring.rest.model.Scoring;
import com.paulina.credit_risk_scoring.rest.repository.ScoringRepository;
import com.paulina.credit_risk_scoring.rest.service.ScoringService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ScoringServiceImpl implements ScoringService {

    private final ScoringRepository scoringRepository;

    @Override
    public Scoring createScoring(Scoring scoring) {
        return scoringRepository.save(scoring);
    }

    @Override
    public List<Scoring> getAllScorings() {
        return scoringRepository.findAll();
    }

    @Override
    public Scoring getScoringById(Long id) {
        return scoringRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Scoring not found with id: " + id));
    }

    @Override
    public void deleteScoring(Long id) {
        scoringRepository.deleteById(id);
    }
}
