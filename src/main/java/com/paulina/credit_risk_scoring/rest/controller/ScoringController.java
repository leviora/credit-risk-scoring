package com.paulina.credit_risk_scoring.rest.controller;

import com.paulina.credit_risk_scoring.assembler.ScoringModelAssembler;
import com.paulina.credit_risk_scoring.dto.ScoringDTO;
import com.paulina.credit_risk_scoring.mapper.ScoringMapper;
import com.paulina.credit_risk_scoring.representation.ScoringModel;
import com.paulina.credit_risk_scoring.rest.model.Scoring;
import com.paulina.credit_risk_scoring.rest.service.ScoringService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.reactive.WebFluxLinkBuilder.methodOn;

@RestController
@RequestMapping("/api/scorings")
@RequiredArgsConstructor
public class ScoringController {

    private final ScoringService scoringService;
    private final ScoringMapper scoringMapper;
    private final ScoringModelAssembler scoringModelAssembler;

    @PostMapping
    public ResponseEntity<ScoringModel> createScoring(@RequestBody @Valid ScoringDTO scoringDTO) {
        Scoring scoring = scoringMapper.toEntity(scoringDTO);
        Scoring savedScoring = scoringService.createScoring(scoring);
        ScoringModel responseModel = scoringModelAssembler.toModel(savedScoring);

        return ResponseEntity
                .created(linkTo(methodOn(ScoringController.class).getScoringById(savedScoring.getId())).toUri())
                .body(responseModel);
    }

    @GetMapping
    public ResponseEntity<CollectionModel<ScoringModel>> getAllScorings() {
        List<Scoring> scorings = scoringService.getAllScorings();
        List<ScoringModel> scoringModels = scorings.stream()
                .map(scoringModelAssembler::toModel)
                .toList();

        return ResponseEntity.ok(CollectionModel.of(scoringModels));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ScoringModel> getScoringById(@PathVariable Long id) {
        Scoring scoring = scoringService.getScoringById(id);
        ScoringModel model = scoringModelAssembler.toModel(scoring);
        return ResponseEntity.ok(model);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteScoring(@PathVariable Long id) {
        scoringService.deleteScoring(id);
        return ResponseEntity.noContent().build();
    }
}
