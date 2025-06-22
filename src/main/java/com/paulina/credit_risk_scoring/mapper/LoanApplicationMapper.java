package com.paulina.credit_risk_scoring.mapper;

import com.paulina.credit_risk_scoring.dto.LoanApplicationDTO;
import com.paulina.credit_risk_scoring.rest.model.LoanApplication;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LoanApplicationMapper {

    LoanApplicationDTO toDTO(LoanApplication loanApplication);
    LoanApplication toEntity(LoanApplicationDTO loanApplicationDTO);

}
