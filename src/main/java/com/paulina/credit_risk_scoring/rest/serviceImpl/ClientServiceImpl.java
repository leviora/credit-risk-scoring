package com.paulina.credit_risk_scoring.rest.serviceImpl;

import com.paulina.credit_risk_scoring.rest.model.Client;
import com.paulina.credit_risk_scoring.rest.repository.ClientRepository;
import com.paulina.credit_risk_scoring.rest.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    @Override
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }


    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client getClientById(Long id) {
        return clientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Client not found with id: " + id));
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }
}
