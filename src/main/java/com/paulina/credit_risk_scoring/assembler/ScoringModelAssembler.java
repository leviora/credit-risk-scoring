package com.paulina.credit_risk_scoring.assembler;

import com.paulina.credit_risk_scoring.mapper.ScoringMapper;
import com.paulina.credit_risk_scoring.representation.ScoringModel;
import com.paulina.credit_risk_scoring.rest.controller.ScoringController;
import com.paulina.credit_risk_scoring.rest.model.Scoring;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class ScoringModelAssembler implements RepresentationModelAssembler<Scoring, ScoringModel> {

    private final ScoringMapper scoringMapper;

    public ScoringModelAssembler(ScoringMapper scoringMapper) {
        this.scoringMapper = scoringMapper;
    }

    @Override
    public ScoringModel toModel(Scoring scoring) {
        ScoringModel model = scoringMapper.toModel(scoring);
        model.add(linkTo(methodOn(ScoringController.class).getScoringById(scoring.getId())).withSelfRel());
        model.add(linkTo(methodOn(ScoringController.class).getAllScorings()).withRel("all-scorings"));

        return model;
    }
}
