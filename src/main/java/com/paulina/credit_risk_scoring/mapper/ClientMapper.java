package com.paulina.credit_risk_scoring.mapper;

import com.paulina.credit_risk_scoring.dto.ClientDTO;
import com.paulina.credit_risk_scoring.rest.model.Client;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ClientMapper {

//    ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);

    ClientDTO toDTO(Client client);
    Client toEntity(ClientDTO clientDTO);
}
