package com.paulina.credit_risk_scoring.mapper;

import com.paulina.credit_risk_scoring.dto.CreditProfileDTO;
import com.paulina.credit_risk_scoring.rest.model.Client;
import com.paulina.credit_risk_scoring.rest.model.CreditProfile;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface CreditProfileMapper {

    @Mapping(target = "client", source = "clientId", qualifiedByName = "mapClientIdToClient")
    CreditProfile toEntity(CreditProfileDTO dto);

    @Mapping(target = "clientId", source = "client.id")
    CreditProfileDTO toDTO(CreditProfile creditProfile);

    @Named("mapClientIdToClient")
    default Client mapClientIdToClient(Long clientId) {
        if (clientId == null) {
            return null;
        }
        Client client = new Client();
        client.setId(clientId);
        return client;
    }
}
