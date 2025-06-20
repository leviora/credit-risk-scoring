package com.paulina.credit_risk_scoring.rest.controller;

import com.paulina.credit_risk_scoring.assembler.ClientModelAssembler;
import com.paulina.credit_risk_scoring.dto.ClientDTO;
import com.paulina.credit_risk_scoring.mapper.ClientMapper;
import com.paulina.credit_risk_scoring.representation.ClientModel;
import com.paulina.credit_risk_scoring.rest.model.Client;
import com.paulina.credit_risk_scoring.rest.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.reactive.WebFluxLinkBuilder.methodOn;

@RestController
@RequestMapping("/api/clients")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;
    private final ClientMapper clientMapper;
    private final ClientModelAssembler clientModelAssembler;


    @PostMapping
    public ResponseEntity<ClientModel> createClient(@RequestBody ClientDTO clientDTO) {
        Client client = clientMapper.toEntity(clientDTO);
        Client savedClient = clientService.createClient(client);
        ClientModel responseModel = clientModelAssembler.toModel(savedClient);

        return ResponseEntity
                .created(linkTo(methodOn(ClientController.class).getClientById(savedClient.getId())).toUri())
                .body(responseModel);
    }

    @GetMapping
    public ResponseEntity<CollectionModel<ClientModel>> getAllClients() {
        List<Client> clients = clientService.getAllClients();
        List<ClientModel> clientModels = clients.stream()
                .map(clientModelAssembler::toModel)
                .toList();

        return ResponseEntity.ok(CollectionModel.of(clientModels));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClientModel> getClientById(@PathVariable Long id) {
        Client client = clientService.getClientById(id);
        ClientModel model = clientModelAssembler.toModel(client);
        return ResponseEntity.ok(model);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
        return ResponseEntity.noContent().build();
    }
}
