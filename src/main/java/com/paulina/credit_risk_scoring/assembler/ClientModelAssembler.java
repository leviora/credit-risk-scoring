package com.paulina.credit_risk_scoring.assembler;

import com.paulina.credit_risk_scoring.mapper.ClientMapper;
import com.paulina.credit_risk_scoring.representation.ClientModel;
import com.paulina.credit_risk_scoring.rest.controller.ClientController;
import com.paulina.credit_risk_scoring.rest.model.Client;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class ClientModelAssembler implements RepresentationModelAssembler<Client, ClientModel> {

    private final ClientMapper clientMapper;

    public ClientModelAssembler(ClientMapper clientMapper) {
        this.clientMapper = clientMapper;
    }

    @Override
    public ClientModel toModel(Client client) {

        ClientModel model = clientMapper.toModel(client);
        model.add(linkTo(methodOn(ClientController.class).getClientById(client.getId())).withSelfRel());
        model.add(linkTo(methodOn(ClientController.class).getAllClients()).withRel("all-clients"));
        return model;
    }
}
