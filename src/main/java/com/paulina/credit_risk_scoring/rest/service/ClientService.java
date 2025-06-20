package com.paulina.credit_risk_scoring.rest.service;

import com.paulina.credit_risk_scoring.dto.ClientDTO;
import com.paulina.credit_risk_scoring.rest.model.Client;

import java.util.List;

public interface ClientService {
    Client createClient(Client client);
    List<Client> getAllClients();
    Client getClientById(Long id);
    void deleteClient(Long id);
}
