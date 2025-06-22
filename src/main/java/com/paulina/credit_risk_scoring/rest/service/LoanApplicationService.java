package com.paulina.credit_risk_scoring.rest.service;

import com.paulina.credit_risk_scoring.dto.LoanApplicationDTO;
import com.paulina.credit_risk_scoring.rest.model.LoanApplication;

public interface LoanApplicationService {

    LoanApplication createLoanApplication(LoanApplicationDTO loanApplicationDTO);
}
