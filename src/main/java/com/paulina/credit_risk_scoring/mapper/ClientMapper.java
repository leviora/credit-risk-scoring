package com.paulina.credit_risk_scoring.mapper;

import com.paulina.credit_risk_scoring.dto.ClientDTO;
import com.paulina.credit_risk_scoring.representation.ClientModel;
import com.paulina.credit_risk_scoring.rest.model.Client;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    ClientDTO toDTO(Client client);
    Client toEntity(ClientDTO clientDTO);

    ClientModel toModel(Client client);
}
